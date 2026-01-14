import enums.StatusDePedido;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy' as 'HH:mm");

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        LocalDate nasc = LocalDate.parse(sc.nextLine(), ftm);

        System.out.print("Digite o estado do pedido: ");
        StatusDePedido status = StatusDePedido.valueOf(sc.next().toUpperCase());
        Cliente cliente = new Cliente(nome, email, nasc);

        Pedido pedido = new Pedido(LocalDateTime.now(), status, cliente);

        System.out.print("Quantos itens tem este pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do #" + (i+1) + " item");
            System.out.print("Nome: ");
            String pNome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();

            Produto produto = new Produto(pNome, preco);

            sc.nextLine();
            System.out.print("Quantidade: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();

            OrdemDePedido ordemDePedido = new OrdemDePedido(quantidade, preco, produto);
            pedido.addItem(ordemDePedido);

        }

        System.out.println("Orçamento: ");
        System.out.println("horario: " + pedido.getHora().format(ftm2));
        System.out.println("Status do pedido: " + pedido.getStatus().toString());
        System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getNasc().format(ftm) + " - " + cliente.getEmail());
        System.out.println("Itens do pedido: ");
        for (OrdemDePedido item : pedido.getOrdemDePedido()) {
            System.out.println( item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() + ", R$" + item.subTotal());
        }
        System.out.println("TOTAL: " + pedido.total());
    }

}
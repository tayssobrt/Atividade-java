import enums.StatusDePedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Data de nascimento (DD/MM/YYYY): ");
        LocalDate nasc = LocalDate.parse(sc.nextLine(), ftm);
        System.out.println("Digite o estado do pedido: ");
        StatusDePedido status = StatusDePedido.valueOf(sc.next());
        Cliente cliente = new Cliente(nome, email, nasc);

        Pedido pedido = new Pedido(LocalDate.now(), status, cliente);

        System.out.println("Quantos itens tem este pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do #" + (i+1) + "item");
            System.out.println("Nome: ");
            String pNome = sc.nextLine();
            System.out.println("Preço: ");
            Double preco = sc.nextDouble();

            Produto produto = new Produto(pNome, preco);

            sc.nextLine();
            System.out.println("Quantidade: ");
            Integer quantidade = sc.nextInt();
            sc.nextLine();

            OrdemDePedido ordemDePedido = new OrdemDePedido(quantidade, preco, produto);

        }

    }

}
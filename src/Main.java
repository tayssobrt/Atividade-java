import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
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
        sc.nextLine();
        System.out.println("Digite o estado do pedido: ");
        String status = sc.nextLine();
        Cliente cliente = new Cliente(nome, email, nasc);

    }

}
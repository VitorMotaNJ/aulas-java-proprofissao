import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Anos: ");
        int anos = sc.nextInt();
        System.out.print("Meses: ");
        int meses = sc.nextInt();
        System.out.print("Dias: ");
        int dias = sc.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;
        System.out.println("Idade em dias: " + totalDias);
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Depósito mensal: ");
        double deposito = sc.nextDouble();
        System.out.print("Taxa de juros mensal (em %): ");
        double taxa = sc.nextDouble() / 100;

        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + deposito) * (1 + taxa);
        }

        System.out.println("Montante após 12 meses: " + montante);
        sc.close();
    }
}

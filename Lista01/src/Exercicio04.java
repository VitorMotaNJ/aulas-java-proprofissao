import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        System.out.println("Média ponderada: " + media);
        sc.close();
    }
}

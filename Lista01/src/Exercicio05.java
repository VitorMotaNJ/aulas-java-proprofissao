import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();

        double salarioLiquido = salarioBase + (salarioBase * 0.05);
        System.out.println("Salário líquido: " + salarioLiquido);
        sc.close();
    }
}

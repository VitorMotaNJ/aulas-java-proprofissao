import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Salário atual: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.15;
        System.out.println("Novo salário com 15% de aumento: " + novoSalario);
        sc.close();
    }
}

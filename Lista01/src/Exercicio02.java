import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        double perimetro = 2 * 3.14 * raio;

        System.out.printf("Área: %.2f \n",  area);
        System.out.printf("Perímetro: %.2f ", perimetro);
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o valor do "+ i + "° numero");
            numero = sc.nextInt();
            contador += numero;

        }
        System.out.println("Soma de todos os numeros: " + contador);
    }
}

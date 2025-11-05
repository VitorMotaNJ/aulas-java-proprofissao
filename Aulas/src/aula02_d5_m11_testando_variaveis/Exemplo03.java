package aula02_d5_m11_testando_variaveis;

import java.util.Scanner;


public class Exemplo03 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;

        System.out.println("Digite a primeira nota: ");
        nota1 = new Scanner(System.in).nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = new Scanner(System.in).nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = new Scanner(System.in).nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das 3 notas é: %.2f%n", media);

    }
}

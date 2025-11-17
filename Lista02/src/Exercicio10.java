import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------TABUADA-----------------");
        System.out.println("Digite o numero que você deseja ver a tabuada:");
        int numero = sc.nextInt();
        System.out.println("TABUADA DE " + numero + "");
        int i = 0;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i) + "");
            i++;
        }while (i <= 10);

    }
}

import java.util.Scanner;

public class Exercicio12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contador = 0;

        for (int i =0; i < 20; i++){

            System.out.println("Digite um numero");
            num = sc.nextInt();

            if (num % 2 == 0){
                contador++;
            };

        };
        System.out.println("Números digitados que são pares: " + contador);

    }
}

import java.util.Scanner;

public class Exercicio14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        for (int i =0; i < 20; i++){

            System.out.println("Digite um numero");
            num = sc.nextInt();

            if (num > 0 && num < 100){
                contador1++;
            }else if (num > 100 && num < 200){
                contador2++;
            } else if (num > 200){
                contador3++;
            }

        };
        System.out.println("Números digitados que estão entre 0 e 100: " + contador1);
        System.out.println("Números digitados que estão entre 101 e 200: " + contador2);
        System.out.println("Números digitados que estão maiores de 200: " + contador3);
    }
}

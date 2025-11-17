import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int i = 0;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        do{
            System.out.println(i+"º: "+ nome);
            i++;
        }while (i <= 10);

    }
}

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int num;
        int i = 1;
        System.out.println("Digite o nome de um número: ");
        nome = sc.nextLine();
        System.out.println("Digite um numero");
        num = sc.nextInt();
        System.out.println("'Imprimindo o nome '"+nome+"' "+ num + " vezes");
        while(i <= num){
            System.out.println(i+"º: " + nome);
            i++;
        }


    }
}

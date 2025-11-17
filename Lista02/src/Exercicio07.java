import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        int i = 0;
        String nome;
        do{
            System.out.println("Digite o nome de uma pessoa: ");
            nome = sc.nextLine();
            System.out.println("Digite a idade desta pessoa");
            num = sc.nextInt();
            sc.nextLine();
            i++;
            contador += num;
        }while (i < 20);

        System.out.println("Media das idades de todas as "+ i +" pessoas: " + (contador/i));
    }
}

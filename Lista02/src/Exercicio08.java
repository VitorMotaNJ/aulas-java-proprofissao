import java.util.Scanner;

public class Exercicio08 {
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
            if (num >= 18){
                contador++;
            };

        }while (i < 20);

        System.out.println("Pessoas maiores de idade: " + contador);
    }
}

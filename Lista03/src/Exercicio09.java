import java.util.Scanner;

public class Exercicio09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        int i = 0;
        int maisNova = 0;
        String pessoaMaisNova = "";
        String nome;

        while(i < 10){
            System.out.println("Digite o nome de uma pessoa: ");
            nome = sc.nextLine();
            System.out.println("Digite a idade desta pessoa");
            num = sc.nextInt();
            sc.nextLine();
            if (maisNova == 0){
                maisNova = num;
                pessoaMaisNova = nome;
            }else if (num < maisNova){
                maisNova = num;
                pessoaMaisNova = nome;

            }
            i++;
        }
        System.out.println("Pessoa mais nova: " + pessoaMaisNova);
        System.out.println("Idade: " + maisNova);
    }
}


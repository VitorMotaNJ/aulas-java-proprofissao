import java.util.Scanner;

public class Exercicio15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int contador = 0;
        int i = 0;
        int continuar = 1;
        System.out.println("-----SEQUÊNCIA DE NÚMEROS-----");
        do{
            System.out.println("Digite o "+(i+1)+"º numero: ");
            num = sc.nextInt();

            if (num >=0){
                i++;
                contador += num;
            }else{
                System.out.println("Número negativo inserido, encerrando programa.");
                break;
            }
            System.out.println("Número inserido, deseja adicionar outro número? 1 == Sim, 0 == não");
            continuar = sc.nextInt();
            if (continuar == 0) {
                System.out.println("Programa encerrado.");
            }else if (continuar < 0  || continuar > 1){
                System.out.println("Valor inválido! Encerrando programa.");
                break;
            }

        }while (continuar == 1);

        System.out.println("Soma dos "+ i +" números inseridos: " + contador);
    }
}

package aula03_d6_m11_teste_poo;
import java.util.Scanner;

public class TesteCaneta {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Quantas canetas você tem?");
        int qtdCanetas = nc.nextInt();

        int[] vetorCanetas = new int[qtdCanetas];

        for(int i = 0; i < qtdCanetas; i++){

            System.out.println("Qual o modelo da caneta?");

            System.out.println("Qual a cor da caneta?");

            System.out.println("Qual a ponta da caneta?");

            System.out.println("Quanto de carga tem a caneta?");
        }

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "esferográfica";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;

        //caneta1.tampada = true;

        caneta1.tampar();
        caneta1.destampar();
        caneta1.estado();
        caneta1.rabiscar();
        caneta1.desenhar();



    }
}

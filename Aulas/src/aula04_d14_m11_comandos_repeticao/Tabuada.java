package aula04_d14_m11_comandos_repeticao;

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------TABUADA-----------------");
        System.out.println("Digite o numero que você deseja ver a tabuada:");
        int numero = sc.nextInt();
        System.out.println("TABUADA DE " + numero + "");
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i) + "");
        }
    }
}

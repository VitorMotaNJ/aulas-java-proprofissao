package aula03_d6_m11_teste_poo;

public class Caneta {
    /* Definição dos atributos*/

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    /*Criação dos métodos */

    void rabiscar(){

        if(this.tampada){
            System.out.println("A caneta está tampada, não é possível realizar esta operação!");
        }else{
            System.out.println("Pode rabiscar a vontade! :D");
        };
    }

    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void desenhar(){
        System.out.println("Você está desenhando!");
    }

    /*Definição do estado atual*/

    void estado(){
        System.out.println("Esta caneta é do modelo: "+this.modelo);
        System.out.println("Esta caneta é da cor: "+this.cor);
        System.out.println("Esta caneta tem a ponta: "+this.ponta);
        System.out.println("Esta caneta está com a carga em: "+this.carga+"%");
        System.out.println("Esta caneta está tampada? "+this.tampada);
    }
}

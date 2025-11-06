package aula03_d6_m11_teste_poo;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "esferográfica";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        caneta1.tampada = true;

        caneta1.estado();
        caneta1.rabiscar();

    }
}

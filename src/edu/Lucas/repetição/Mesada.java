package edu.Lucas.repetição;
import java.util.concurrent.ThreadLocalRandom;

public class Mesada {
    
    public static void main(String[] args) {
        double mesada = 50.00;
 
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "adcionado ao carrinho: ");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Ana gastou toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}

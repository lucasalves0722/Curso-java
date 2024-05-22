package edu.Lucas.repetição;
public class ExemploWhile {
    public static void main(String[] args) {
        // While (enquanto)
        //While (<condição>){conteúdo que vai se repetir}
        int contador = 0;
        while (contador < 3){
            System.out.println("Olá");
            contador++;
        }
        System.out.println("Fim!");
    }
}
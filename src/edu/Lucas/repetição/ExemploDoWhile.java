package edu.Lucas.repetição;
public class ExemploDoWhile {
    public static void main(String[] args) {
        /**
         * do {
         *      conteúdo
         * } while(<condição>);
         */
        int contador = 400;
        do {
            System.out.println(contador);
            contador-=10;
        } while (contador >= 300);
    }
}

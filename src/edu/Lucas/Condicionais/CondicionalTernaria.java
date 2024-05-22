package edu.Lucas.Condicionais;
public class CondicionalTernaria {
    public static void main(String[] args) {
        // ESTRUTURA CONDICIONAL COMPOSTA EM CONDICIONAL TERNÁRIA
        /** int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/

        // ESTRUTURA CONDICIONAL ENCADEADA EM CONDICIONAL TERNÁRIA
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}

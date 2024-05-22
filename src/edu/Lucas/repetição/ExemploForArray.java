package edu.Lucas.repetição;
public class ExemploForArray {
    public static void main(String[] args) {

        // EM ARRAYS O INDICE INICIA EM ZERO
        /** String alunos [] = {"FELIPE", "LUCAS", "YANCA", "CAIO"};
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x] );
        } */

         //FOR EACH
         String alunos [] = {"FELIPE", "LUCAS", "YANCA", "CAIO"};    
         for(String aluno : alunos){
            System.out.println("O nome do aluno é:" + aluno);    
        }
    }
}

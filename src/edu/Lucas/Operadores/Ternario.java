package edu.Lucas.Operadores;
public class Ternario {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        
        //IF,ELSE:
        //String resultado = "";
        //if (a==b)
            //resultado = "verdadeiro";
        //else
            //resultado = "falso";

        // TERNARIO:
        String resultado = a==b ?"verdadeiro" : "falso";
        // OU PODERIA SER DO TIPO "INT" --> "int resultado = a==b ? 1 : 0;"
            
        System.out.println(resultado);    
    }
}
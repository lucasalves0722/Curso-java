package edu.Lucas.Condicionais;
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 22;

        // ESTRUTURA CONDICIONAL SIMPLES
       /** if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo); */
        
        // ESTRUTURA CONDICIONAL COMPOSTA
        //Quando tiver mais de uma linha para um condição, colocar entre chaves, conforme exemplo abaixo:
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }else
            System.out.println("Saldo insuficiente!");        
        
    }          
}

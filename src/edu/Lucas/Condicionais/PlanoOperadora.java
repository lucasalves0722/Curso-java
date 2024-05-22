package edu.Lucas.Condicionais;
public class PlanoOperadora {
    public static void main(String[] args) {
        //CONCEITO UTILIZADO PARA PROBLEMA DE ESTRUTURA COMPLEMENTAR E NÃO PARA CONTROLE DE FLUXO, EMBORA SEJA ENCADEADA.
        String plano = "M";
        //DIGITADO EM ORDEM CRESCENTE EM RELAÇÃO A SUA "GRANDEZA"
        switch (plano) {
            //PLANO COMPLETO:
            case "T": {
                System.out.println("5Gb Youtube.");
            }
            //PLANO MEDIO:
            case "M": {
                System.out.println("Whats e Instagram grátis.");
            }
            //PLANO BÁSICO:
            case "B": {
                System.out.println("100 minutos de ligação.");
            }
        }
    }
}

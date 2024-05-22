package edu.Lucas.algoritmo;
public class NomeCompleto {
    public static void main(String[] args) {
        
        String primeiroNome = "Lucas";
        String segundoNome ="Alves";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
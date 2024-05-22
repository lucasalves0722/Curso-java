package edu.Lucas.Desafios;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep deve conter 8 dígitos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();

            return "12.345-678";
    }
}

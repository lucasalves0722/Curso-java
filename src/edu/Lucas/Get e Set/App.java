package edu.Lucas;
public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        //ALTERAR OS VALORES
        pessoa.setNome("Yanca");
        pessoa.setIdade(24);
        pessoa.setAltura(1.70);
        
        //APRESENTAR OS VALORES
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
    
}

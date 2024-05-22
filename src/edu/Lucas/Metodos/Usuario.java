package edu.Lucas.Metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();


        System.out.println("A TV está ligada ? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status -> TV está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.mudarCanal(9);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> TV está ligada ? " + smartTv.ligada);
    }
} 
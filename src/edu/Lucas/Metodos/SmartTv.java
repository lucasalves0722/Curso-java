package edu.Lucas.Metodos;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando de canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudando de canal para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Amentando o volume para : " + volume);
    }

    
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para : " + volume);
    }
}
package edu.Lucas.Desafios;
import java.util.Scanner;

public class SimulacaoBancaria {

 public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       double saldo = 0;

       // Loop infinito para manter o programa em execução até que o usuário decida sair

       while (true) {

           System.out.println("Menu:");

           System.out.println("1. Depositar");

           System.out.println("2. Sacar");

           System.out.println("3. Consultar Saldo");

           System.out.println("0. Encerrar");

           System.out.print("Escolha uma opção: ");

  int opcao = scanner.nextInt();

            switch (opcao) {

               case 1: // Depósito

                   System.out.print("Informe o valor a depositar: ");

                   double valorDeposito = scanner.nextDouble();

                   saldo += valorDeposito;

                   System.out.println("Saldo atual: " + saldo);

                   break;

               case 2: // Saque

                   System.out.print("Informe o valor a sacar: ");

                   double valorSaque = scanner.nextDouble();

                   if (valorSaque <= saldo) {

                       saldo -= valorSaque;

                       System.out.println("Saque realizado com sucesso. Saldo remanescente: " + saldo);

                   } else {

                       System.out.println("Saldo insuficiente.");

                   }

                   break;

               case 3: // Consultar saldo

                   System.out.println("Saldo atual: " + saldo);

                   break;

               case 0: // Encerrar programa

                   System.out.println("Programa encerrado.");

                   scanner.close();

                   return; // Termina o método main e encerra o programa

               default: // Opção inválida

                   System.out.println("Opção inválida. Tente novamente.");

                   break;

           }

       }

   }

}
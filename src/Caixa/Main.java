package Caixa;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    Caixa operacoes = new Caixa();

    System.out.println("----Caixa Eletrônico----");

    System.out.println("Quantos lançamentos deseja: ");
    int lancamentos = inputUsuario.nextInt();

    for(int i = 0; i < lancamentos; i++){
      System.out.println("Lançamento " + i);
      System.out.println("Crédito ou Débito?");
      String operacao = inputUsuario.next();

      if(operacao.equals("crédito")){
        System.out.println("Valor do depósito: ");
        double deposito = inputUsuario.nextDouble();
        operacoes.credito(deposito);
      } else if(operacao.equals("débito")){
        System.out.println("Valor do saque: ");
        double saque = inputUsuario.nextDouble();
        operacoes.debito(saque);
      } else {
        System.out.println("Operação não permitida!!");
      }
    }
    System.out.println("Saldo atual: "+ operacoes.saldo);
  }
}

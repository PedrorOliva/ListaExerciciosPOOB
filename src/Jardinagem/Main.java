package Jardinagem;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Nome do jardim: ");
    String nomeJardim = inputUsuario.next();
    System.out.println("Qual o tamanho do jardim? ");
    double qtdMetros = inputUsuario.nextDouble();
    System.out.println("Quantas plantas: ");
    int qtdPlantas = inputUsuario.nextInt();
    System.out.println("Qual o tamanho da grama? ");
    int qtdMetrosGrama = inputUsuario.nextInt();
    System.out.println("Qual a quantidade de adubo em gramas? ");
    int gramaAdubo = inputUsuario.nextInt();
    System.out.println("Qual o valor do metro de grama? ");
    double valorMetroGrama = inputUsuario.nextDouble();
    System.out.println("Valor do corte da grama: ");
    double valorCorteGrama = inputUsuario.nextDouble();
    System.out.println("Informe o valor do adubo: ");
    double valorAdubo = inputUsuario.nextDouble();

    Jardinagem novoJardim = new Jardinagem(nomeJardim, qtdMetros, qtdPlantas, qtdMetrosGrama, gramaAdubo,
        valorMetroGrama, valorCorteGrama, valorAdubo);


    novoJardim.usarAdubo();
    novoJardim.precoAdubo();
    novoJardim.precoCorteGrama();
  }
}

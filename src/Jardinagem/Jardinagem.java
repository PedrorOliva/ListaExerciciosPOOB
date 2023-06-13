package Jardinagem;

public class Jardinagem {
  String nomeJardim;
  Double qtdMetros;
  Integer qtdPlantas;
  Integer qtdMetrosGrama;
  Integer gramaAdubo;
  Double valorAdubo;
  Double valorMetroGrama;
  Double valorCorteGrama;

  public Jardinagem(String nomeJardim, Double qtdMetros, Integer qtdPlantas, Integer qtdMetrosGrama,
                    Integer gramaAdubo, Double valorAdubo, Double valorMetroGrama, Double valorCorteGrama) {
    this.nomeJardim = nomeJardim;
    this.qtdMetros = qtdMetros;
    this.qtdPlantas = qtdPlantas;
    this.qtdMetrosGrama = qtdMetrosGrama;
    this.gramaAdubo = gramaAdubo;
    this.valorAdubo = valorAdubo;
    this.valorMetroGrama = valorMetroGrama;
    this.valorCorteGrama = valorCorteGrama;
  }

  public void usarAdubo() {
    double qtdAdubo = (qtdMetrosGrama / 2 ) * gramaAdubo;
    System.out.println("Quantidade de adubo a ser usado: " + qtdAdubo);
  }

  public void precoAdubo() {
    double qtdAdubo = (qtdMetrosGrama / 2 ) * gramaAdubo;
    double totalAdubo = qtdAdubo * valorAdubo;
    System.out.println("Valor do adubo R$: " + totalAdubo);
  }

  public void precoCorteGrama() {
    double totalCorte = qtdMetrosGrama * valorMetroGrama;
    System.out.println("Valor do corte da grama: R$" + totalCorte);
  }
}
package Caixa;

public class Caixa {
  Double saldo;

  public Caixa() {
    saldo = 1000.00;
  }

  public void debito(double valor){
    saldo = saldo - valor;
  }

  public void credito(double valor){
    saldo = saldo + valor;
  }
}


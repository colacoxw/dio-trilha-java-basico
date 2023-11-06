public abstract class Conta implements IConta {

  protected static final int AGENCIA_PADRAO = 1;

  protected int agencia;
  protected int conta;
  protected double saldo;
  private Cliente cliente;

  private static int SEQUENCIAL = 1;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.conta = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }
  
  @Override
  public void depositar(double valor) {
  saldo += valor;
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  protected void imprimirInfosComuns(){
    System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
    System.out.println(String.format("Agencia: %d", this.agencia));
    System.out.println(String.format("Numero: %d", this.conta));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }

  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public double getSaldo() {
    return saldo;
  }

  
}

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50;
    while(mesada > 0) {
      double valorDoce = valorAleatorio();
      if(valorDoce > mesada) {
        System.out.println("Impossivel comprar mais doces");
        break;
      }

      System.out.println("Doce do valor: " + valorDoce + " foi adicionado ao carrinho!");
      mesada -= valorDoce;
    }

    System.out.println("Mesada: " + mesada);
    System.out.println("Rafael gastou toda a sua mesada em doces!");
  }

  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2,8);
  }
}

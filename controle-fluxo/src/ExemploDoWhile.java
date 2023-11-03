import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
    System.out.println("Discando...");
    
    do {
      System.out.println("Telefone tocando");
    }
    while(tocando());
  }

  private static boolean tocando() {
    // Gera um número aleatório entre 0 e 2. Se o número for 1, 'atendeu' será verdadeiro, caso contrário, será falso.
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    
    // Retorna o oposto do valor de 'atendeu'. Se 'atendeu' for verdadeiro, retorna falso, o que termina o loop. Se 'atendeu' for falso, retorna verdadeiro, o que continua o loop.
    return ! atendeu;
  }
}

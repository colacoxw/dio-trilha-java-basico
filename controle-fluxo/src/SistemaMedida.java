public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "A";

    switch (sigla) {
      case "P":
        System.out.println("Pequena");
        break;
        
      case "M":
        System.out.println("Media");
        break;

      case "G":
        System.out.println("Grande");
        break;

      default:
        System.out.println("Indefinido");
        break;
    }
  }
}

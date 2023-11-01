public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M";

    switch (plano){
      case "T":
        System.out.println("5GB de Youtube");
      case "M":
        System.out.println("Whats e Instagram grátis");
      case "B":
        System.out.println("100 minutor de ligação");
        break;
      default:
        System.out.println("Plano indefinido!");
    }
  }
}

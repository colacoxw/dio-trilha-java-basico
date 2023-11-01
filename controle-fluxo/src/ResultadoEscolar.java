public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 6;

    if(nota >= 7){
      System.out.println("Aluno Aprovado!");
    } 
    else if(nota >= 5 && nota < 7) {
      System.out.println("Aluno em recuperação");
    }
    else {
      System.out.println("Aluno Reprovado!");
    }

    //Operador ternário

    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

    System.out.println(resultado);
  }
}

public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = {"Felipe", "Rafael", "Luciano", "Eduarda", "Rose"};

    for(int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno no indice x=" + (i+1) + " é " + alunos[i]);
    }
  }
}

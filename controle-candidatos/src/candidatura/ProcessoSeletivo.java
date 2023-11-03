package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String [] candidatos = {"Rafael", "Luciano", "Carlos", "Mauro", "Eduarda"};

    for(String candidato: candidatos) {  
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuaTentando = true, atendeu = false;

    do {
      atendeu = atender();
      continuaTentando = !atendeu;
      if(continuaTentando) {
        tentativasRealizadas++;
      } 
      else {
        System.out.println("Contato realizado com sucesso");
      }
    }
    while(continuaTentando && tentativasRealizadas < 3);

    if(atendeu) {
      System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
    }
    else {
      System.out.println("Não conseguimos contato com " + candidato + ", com " + tentativasRealizadas + " tentativas realizadas!");
    }
  }

  static boolean atender() {
    return new Random().nextInt(3)==1;
  }

  static void imprimirSelecionados() {
    String [] candidatos = {"Rafael", "Luciano", "Carlos", "Mauro", "Eduarda"};

    System.out.println("Imprimindo a lista de candidatos utilizando o for para mostrar o indice");
    for(int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato de n° " + (i+1) + "é o " + candidatos[i]);
    }

    System.out.println("Forma abrevida de interação for each");
    for(String candidato: candidatos) {
      System.out.println("O candidato selecionada foi: " + candidato);
    }
  }

  static void selecaoDeCandidatos() {
    String [] candidatos = {"Rafael", "Luciano", "Carlos", "Mauro", "Eduarda", "Bianca", "Maria", "Julio", "Lucas", "Laura"};
    
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou: " + salarioPretendido);
      
      if(salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
        candidatosSelecionados++;
      }

      candidatoAtual++;
    }
  }
  
  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;

    if(salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato!");
    }
    else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato e oferecer uma contra proposta!");
    } 
    else {
      System.out.println("Aguardando demais candidatos!");
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }
}

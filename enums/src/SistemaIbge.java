/*
 * Essa classe é um exemplo de como usar o enum EstadoBrasileiro, 
 * que representa os estados do Brasil com seus respectivos nomes, siglas, 
 * códigos IBGE e nomes em maiúsculo. O método main da classe faz o seguinte:
 */
public class SistemaIbge {
    public static void main(String[] args) {
        // Percorre todos os valores do enum EstadoBrasileiro e imprime a sigla e o nome de cada estado na tela.
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        // Cria uma variável eb do tipo EstadoBrasileiro e atribui o valor PIAUI a ela.
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        // Imprime o nome, a sigla, o nome em maiúsculo e o código IBGE do estado PIAUI na tela.
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}

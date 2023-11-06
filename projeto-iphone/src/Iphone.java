import apps.NavegadorWeb;
import apps.ReprodutorMusical;
import apps.Telefone;

public class Iphone {
  public static void main(String[] args) {
    System.out.println("-----Reprodutor Musical-----");
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    reprodutorMusical.selecionarMusica();
    reprodutorMusical.tocar();
    reprodutorMusical.pausar();

    System.out.println("-----Telefone-----");
    Telefone telefone = new Telefone();
    telefone.atender();
    telefone.ligar();
    telefone.iniciarCorreioVoz();

    System.out.println("-----Navegador Web-----");
    NavegadorWeb navegadorWeb = new NavegadorWeb();
    navegadorWeb.abrirNavegador();
    navegadorWeb.adicionarNovaAba();
    navegadorWeb.atualizarPagina();
  }
}

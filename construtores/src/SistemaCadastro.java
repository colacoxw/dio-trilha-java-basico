public class SistemaCadastro {
    public static void main(String [] args) {
        Pessoa marcos = new Pessoa("9999999999","Rafael");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}

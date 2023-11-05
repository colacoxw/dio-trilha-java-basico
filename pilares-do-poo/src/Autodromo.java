public class Autodromo {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.ligar();
        civic.setChassi("sda22131asa");

        Moto titan = new Moto();
        titan.setChassi("12345");
        titan.ligar();

        Veiculo coringa = civic;

        coringa.ligar();

    }
}

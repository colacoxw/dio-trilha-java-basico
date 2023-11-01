public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual é o canal atual? " + smartTv.canal);
        System.out.println("Qual é o volume atual? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual é o volume atual? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Qual é o canal atual? " + smartTv.canal);
    }
}

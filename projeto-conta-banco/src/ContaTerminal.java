import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroDaConta;
        String agencia, nomeCliente;
        double saldoDaConta;

        System.out.println("Por favor, digite o número da conta !");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        saldoDaConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta + " já está disponível para saque.");
    }
}

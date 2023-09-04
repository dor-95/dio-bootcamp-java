import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String client = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agency = scanner.next();

        System.out.println("Digite o número da conta: ");
        int account = scanner.nextInt();

        System.out.println("Digite o valor que deseja depositar: ");
        double amount = scanner.nextDouble();

        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque.", client, agency, account, amount);
    }
}

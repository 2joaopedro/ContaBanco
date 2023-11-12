import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o numero da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Informe seu saldo: ");
        float saldo = Float.parseFloat(scanner.nextLine());

        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", Conta " + numero  + "  e seu saldo "  + saldo + " já está disponível para saque");

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

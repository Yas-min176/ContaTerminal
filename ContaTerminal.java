import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Exibir mensagem para o usuário
        System.out.println("Bem-vindo ao Banco Yas, comece criando sua conta!");

        // Criar um objeto Scanner para ler entradas do terminal
        Scanner scanner = new Scanner(System.in);

        // Obter os valores digitados pelo usuário
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();  // Leitura do número da conta

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();  // Leitura do saldo inicial

        // Exibir mensagem de conta criada com os valores informados
        System.out.println("\nConta criada com sucesso:");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("\nObrigada pela preferência! :)");

        // Fechar o scanner para liberar recursos
        scanner.close();
    }
}
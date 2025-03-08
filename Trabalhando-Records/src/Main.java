import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o depósito inicial: R$");
            double depositoInicial = scanner.nextDouble();
            ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;
        do {
            System.out.println("\n-------- Menu --------");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.print("Digite o valor do depósito: R$");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                }
                case 4 -> {
                    System.out.print("Digite o valor do saque: R$");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                }
                case 5 -> {
                    System.out.print("Digite o valor do boleto: R$");
                    double boleto = scanner.nextDouble();
                    conta.pagarBoleto(boleto);
                }
                case 6 -> conta.verificarChequeEspecial();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        }
    }
}
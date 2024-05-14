import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1: // Depositar
                    double valorDepositado = scanner.nextDouble();
                    saldo = depositar(valorDepositado, saldo);
                    System.out.printf("Saldo atual: %s%n", saldo);
                    break;
                case 2: // Sacar
                    double valorSacado = scanner.nextDouble();
                    saldo = sacar(valorSacado, saldo);
                    if (saldo == 0.0) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    System.out.printf("Saldo atual: %s%n", saldo);
                    break;
                case 3: // Consultar Saldo
                    System.out.printf("Saldo atual: %s%n", saldo);
                    break;
                case 0: // Encerrar
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static double depositar(double valorDepositado, double saldo) {
        return saldo + valorDepositado;
    }

    public static double sacar(double valorSacado, double saldo) {
        if (saldo < valorSacado) {
            return 0.0;
        }
        return saldo - valorSacado;
    }
}
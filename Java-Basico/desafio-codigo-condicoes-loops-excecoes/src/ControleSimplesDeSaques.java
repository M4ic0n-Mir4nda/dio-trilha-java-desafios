import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        for (int i = 0; i < limiteDiario; i++) {
            double valor = scanner.nextDouble();
            if (valor > limiteDiario) {
                System.out.print("Limite diario de saque atingido. Transacoes encerradas.");
                return;
            } else if (valor == 0) {
                System.out.println("Transacoes encerradas.");
                return;
            }
            limiteDiario -= valor;
            System.out.printf("Saque realizado. Limite restante: %s%n", limiteDiario);
        }

        scanner.close(); 
    }
}
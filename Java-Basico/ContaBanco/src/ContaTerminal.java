import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Agencia: ");
        String agencia = scanner.next();

        System.out.println("Numero: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        String msg = String.format(
                "Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.",
                nome, sobrenome, agencia, numero, saldo);

        System.out.println(msg);
    }
}

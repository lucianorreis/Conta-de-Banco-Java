import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Integer Numero = 1021;
        String Agencia = "067-8", NomeCliente = "FULANINHO VENDAVAL";
        Double Saldo = 237.48;

        System.out.println("------- BEM VINDO! --------");
        System.out.println("Por favor, Digite o número de sua Agência: ");
            int numAgencia = scanner.nextInt();

        if (numAgencia == Numero) {
            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " Já está disponível para saque");
        } else {
            System.out.println("Conta não encontrada!");
        }
        
    }
}

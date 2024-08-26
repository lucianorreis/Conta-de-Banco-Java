import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new 
            Scanner(System.in).useLocale(Locale.US);

        Integer Numero = 1021;
        String Agencia = "067-8", NomeCliente = "FULANINHO VENDAVAL";
        Double Saldo = 237.48;
        Integer numAgencia;

        System.out.println("------- BEM VINDO! --------");
        
        do {
            System.out.println("Por favor, Digite o número de sua Agência: ");
            numAgencia = scanner.nextInt();

            if (numAgencia != Numero){
                System.out.print("Erro! Agência não encontrada"); 
            } 
        } while (numAgencia != Numero);

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo: " + Saldo + " Já está disponível para saque");
    }
}

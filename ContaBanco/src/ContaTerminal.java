import java.util.Locale;
import java.util.Scanner;


/**
 * 
 * @author Lucianorreis
 * @version 1.0
 *  Este é um projeto simples, feito para testar a sintaxe em Java e
 *  desenvolver o conhecimento básico da lógica.
 *  
 * 
 *  Este pequeno código simula o login em uma conta de banco, sendo o 
 *  Usuário apelidado de "Fulaninho Vendaval"
 * 
 *  Perceba que o código está dividido em partes, visando explicar cada
 *  etapa.
 * 
 * ! Caso esteja interessado em testar diretamente, o Numero da Agência
 * ! Ficcional é: 1021
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
    /* 
    ? ---------------- OBJETO CHAVE -----------------------------
    * Aqui, um novo objeto é criado, chamado de "scanner"
    ? Sua função é permitir que o usuário seja capaz de
    ? inserir dados diretamente pelo terminal.
    */
        Scanner scanner = new 
            Scanner(System.in).useLocale(Locale.US);
    //? ---------------------------------------------------------
    /*
     * ------------------- VARIÁVEIS ----------------------------
     * Variáveis declaradas com seus respectivos tipos e dados.
     ? Note que a variável "numAgencia", não possui dados, ou seja,
     ? ainda será inicializada no código a seguir
     */       
        int Numero = 1021;
        String Agencia = "067-8", NomeCliente = "FULANINHO VENDAVAL";
        Double Saldo = 237.48;
        int numAgencia;
    //* ---------------------------------------------------------
    /* 
     * ---------------------- CÓDIGO ----------------------------
     * O código em si,bem simples, não?  
    */
        System.out.println("------- BEM VINDO! --------");
        System.out.println("Por favor, Digite o número de sua Agência: ");
            numAgencia = scanner.nextInt();
    /**
     * --------------------------------------------------------------------------
     * * Logo abaixo estão as condicionais que fazem o
     * * Programa em si funcionar, note que a classe:
     * * "ContaTerminal" é engatilhada e disparada mais
     * * uma vez caso o Número inserido seja diferente
     * * do número da variável "Numero"
     */
            if (numAgencia != Numero){
                    System.out.print("Erro! Agência não encontrada"); 
                    ContaTerminal.main(args);
            } else if (numAgencia == Numero) {
                System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo: " + Saldo + " Já está disponível para saque");
            }
    }
    // * FIM DO PROGRAMA
}

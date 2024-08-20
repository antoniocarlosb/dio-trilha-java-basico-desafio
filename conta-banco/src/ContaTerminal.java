
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {        
        //TODO: Conhecer e impporta a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /**
         * Exibir as mensagens para o nosso usuário e 
         * obter pela scanner os valores digitados pelo terminal         
        */
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");        
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo:");        
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");                
    }
}

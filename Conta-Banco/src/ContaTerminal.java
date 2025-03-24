import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = sc.next();

        System.out.println("Por favor, digite o número da sua Agencia!");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da sua Conta!");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta!");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ",conta de N° " + conta + " e seu saldo R$" + saldo + " já esta disponivel para saque.");
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome");
        nomeCliente = sc.next();

        System.out.println("Informe o número da agencia");
        agencia = sc.next();

        System.out.println("Informe o número da conta");
        numero = sc.nextInt();

        System.out.println("Digite seu saldo");
        saldo = sc.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", " +
                "conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
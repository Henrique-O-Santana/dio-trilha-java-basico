import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("Digite o primeiro numero:");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = sc.nextInt();

        try {
            contador.contador(n1,n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

}
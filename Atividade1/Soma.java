import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        int x;
        int y;
        int soma;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        x = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        y = scanner.nextInt();

        soma = x + y;
        
        System.out.println("O resultado da soma é: " + soma);
        
        scanner.close();
    }
}






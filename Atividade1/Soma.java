import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        int x;
        int y;
        int soma;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            x = scanner.nextInt();
            
            System.out.println("Digite o segundo número: ");
            y = scanner.nextInt();
            
            soma = x + y; // sum 2 values
            
            System.out.println("O resultado da soma é: " + soma);
        }
    }
}






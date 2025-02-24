import java.util.Scanner;

public class Operacoes { //operations

    public static void main(String[] args) {
        int x;
        int y;
        int soma;
        int subt;
        int multp;
        float dividir;



        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite dois números para a solução de algumas operações! "); //press 2 numbers to calculate
            System.out.println("Primeiro número: "); // first
            x = scanner.nextInt();
            
            System.out.println("Segundo número: "); // second
            y = scanner.nextInt();
            
            soma = x + y;
            
            System.out.println("Soma: " + x + " + " + y + " = " + soma);
            
            subt = x - y;
            
            System.out.println("Soma: " + x + " - " + y + " = " + subt);
            
            multp = x * y;
            
            System.out.println("Multiplicação: " + x + " * " + y + " = " + multp);
            
            dividir = x / y;
            
            System.out.println("Divisão: " + x + " / " + y + " = " + dividir);
        }
    }
}




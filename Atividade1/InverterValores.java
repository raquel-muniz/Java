/*Escrever uma programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

Lembrando que temos que ter 3 variáveis para que uma haja como variável de armazenamento, ou seja, para evitar que o valor original de a se perca é necessário associar a uma outra variável (denominada usualmente de variável auxiliar) tal valor, estabelecer uma associação de a com o valor em b e, por último, associar b ao valor "salvo" na variável auxiliar. */

import java.util.Scanner;

public class InverterValores {

    public static void main(String[] args) {
        float A;
        float B;
        float Troca;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Efetue a troca de valores A para B e vice-versa!");
            
            System.out.println("Digite o valor para a variável A: ");
            A = scanner.nextFloat();
            
            System.out.println("Digite o valor para a variável A: ");
            B = scanner.nextFloat();
            
            //inversão
            
            Troca = A; // reserva o valor da variável A
            A = B;
            B = Troca;
            
            System.out.println("A: " + A + "\n" + "B: " + B);
        }

    }
}


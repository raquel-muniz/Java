/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */

import java.util.Scanner;

public class Prestacoes {

    public static void main(String[] args) {
        double Valor_Compra;
        double Prestacoes; 


        Scanner scanner = new Scanner(System.in);

        System.out.println("Veja o valor das prestações sem juros! ");
        System.out.println("Valor da Compra: ");
        Valor_Compra = scanner.nextDouble();


        System.out.println("De cada prestação: ");

            for (int i = 1; i < 6; i++){
                Prestacoes = Valor_Compra / i;

                System.out.println("Em " + i + " prestações de " + Prestacoes);
            }
        
        scanner.close();
    }
}
/*Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. */

import java.util.Scanner;

public class Cotacao {

    public static void main(String[] args) {
        double Dolar;
        double Real; 
        double cotacao;


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Converta dólar para Real! ");
            System.out.println("Valor em Dólar: ");
            Dolar = scanner.nextDouble();
            
            System.out.println("Valor da cotação do Dólar: ");
            cotacao = scanner.nextDouble();
            
            Real = Dolar * cotacao;
            
            System.out.println("Valor em Reais (convertido): " + Real);
        }
    }
}
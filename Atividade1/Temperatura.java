/*Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

/*Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética). */

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        double C; // temperatura em Celsius
        double F; // temperatura em Fahrenheit

        Scanner scanner = new Scanner(System.in);

        System.out.println("Faça a conversão de Celsius para Fahrenheit. ");
        System.out.println("Temperatura em Celcius (°C): ");
        C = scanner.nextDouble();

        F = ((9 * C) + 160) / 5;

        System.out.println("\n" + C + " °C\n" + F + " °F");
        
        scanner.close();
    }
}




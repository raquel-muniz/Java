/*Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética). */

import java.util.Scanner;

public class Notas {

    //grades
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calcule a média de três notas aqui! ");
            System.out.println("Primeira nota ");
            nota1 = scanner.nextDouble();
            
            System.out.println("Segundo nota: ");
            nota2 = scanner.nextDouble();
            
            System.out.println("Segundo nota: ");
            nota3 = scanner.nextDouble();
            
            media = (nota1 + nota2 + nota3) / 3;
            
            System.out.println("Sua média é: " + media);
        }
    }
}




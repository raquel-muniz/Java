/* */

import java.util.Scanner;

public class Calculo{

    public void main(String[] args) {
        Scanner scanner = new scanner(System.in);
        System.out.println("Qual o tamanho do lado? ");

        double Quadrado = Area(5);
        double Retangulo = Area(4, 6);
        double Circulo = Area(3, true);
        
        System.out.println("Área do quadrado: " + Quadrado);
        System.out.println("Área do retângulo: " + Retangulo);
        System.out.println("Área do círculo: " + Circulo);
    }

    public double Area(double lado){
        return lado * lado;
    }

    public double Area(double largura, double altura) {
        return largura * altura;
    }
    
    public double Area(double raio, boolean isCirculo) {
        return Math.PI * raio * raio;
    }  
}


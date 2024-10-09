/*Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        double salariofx;
        double Total_de_Vendas;
        String nome;
        double comissao;
        double ven_com; // vendas e comissão
        double SalarioTotal;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Estre programa calcula o salário de um vendedor de acordo com a quantidade de vendas efetuadas por eles. ");
            
            System.out.println("\nNome do vendedor: ");
            nome = scanner.nextLine();
            
            System.out.println("\nSalário fixo: ");
            salariofx = scanner.nextDouble();
            
            System.out.println("\nQuantidade total de vendas deste vendedor: ");
            Total_de_Vendas = scanner.nextDouble();
            
            System.out.print("\033[H\033[2J"); // limpar tela
            
            comissao = 0.15;
            
            ven_com = Total_de_Vendas * comissao;
            
            SalarioTotal = salariofx + ven_com;
            
            System.out.println("Nome: " + nome);
            System.out.println("\n\nO salário total é: \f" + SalarioTotal + "!\n");
        }
    }
}




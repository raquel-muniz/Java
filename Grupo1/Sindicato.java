/*Um sindicato dos professores deseja um sistema que gerencie a contribuição sindical dos professores de uma cidade. Um professor possui nome, cpf, titulação (Doutor, Mestre, Especialista) e salário. Realize a entrada de dados para vários professores, enquanto o usuário desejar. Sabe-se que um Especialista contribui 1,2% do salário, já o Mestre 1,4% e o Doutor 1,6%. Ao final, após receber todos os dados dos professores, apresente o total arrecadado pelo sindicato e a quantidade de professores que são Mestre. Fique atento onde cada método e atributo estará distribuído na sua aplicação. */

import java.util.ArrayList;
import java.util.Scanner;

class Professor {
    public String nome;
    private String cpf;
    public String titulacao;
    private double salario;

    public Professor(String nome, String cpf, String titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public double calcularContribuicao() {
        return switch (titulacao) {
            case "Doutor" -> salario * 0.016;
            case "Mestre" -> salario * 0.014;
            case "Especialista" -> salario * 0.012;
            default -> 0;
        };
    }
}

public class Sindicato {
    private final ArrayList<Professor> professores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public double calcularTotalContribuicoes() {
        double total = 0;
        for (Professor professor : professores) {
            total += professor.calcularContribuicao();
        }
        return total;
    }

    public int contarMestres() {
        int count = 0;
        for (Professor professor : professores) {
            if (professor.getTitulacao().equals("Mestre")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sindicato sindicato = new Sindicato();

        while (true) {
            System.out.println("Digite o nome do professor (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o CPF do professor: ");
            String cpf = scanner.nextLine();

            System.out.println("Digite a titulação do professor (Doutor, Mestre, Especialista): ");
            String titulacao = scanner.nextLine();

            System.out.println("Digite o salário do professor: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            sindicato.adicionarProfessor(professor);
        }

        scanner.close();

        double totalContribuicoes = sindicato.calcularTotalContribuicoes();
        int quantidadeMestres = sindicato.contarMestres();

        System.out.println("Total arrecadado pelo sindicato: R$ " + totalContribuicoes);
        System.out.println("Quantidade de professores que são Mestres: " + quantidadeMestres);

    }
}

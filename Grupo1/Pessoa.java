import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String getNome = scan. nextLine();

        System.out.println("Data de Nascimento: ");
        LocalDate dataNascimento = getDataNascimento;

        System.out.println("Altura: ");
        Double altura = nextDouble();

        imprimirDados();

        System.out.println("Idade: " + calcularIdade() + " anos");
    }
}

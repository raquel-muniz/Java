
import java.util.Scanner;

public class ConsumoMedio { 

    public static void main(String[] args) {
        float combustivel;
        float distancia;
        float media;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Descubra o consumo médio do seu automóvel");
            
            System.out.println("Digite a distândia total percorrida, em quilômetros (km): ");
            distancia = scanner.nextFloat();
            
            System.out.println("Digite a quantidade total de combustível gasto, em litros, neste período: ");
            combustivel = scanner.nextFloat();
            
            media = distancia / combustivel;
            
            System.out.println("Consumo médio: " + distancia + " / " + combustivel + " = " + media + "quilômetros por litro.");
        }

    }
}




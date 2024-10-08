import java.util.ArrayList;
import java.util.Scanner;

public class restaurant {
    class Cliente {
        int clienteId;
        String nome;
        String endereco;
        String telefone;

        Cliente(int clienteId, String nome, String endereco, String telefone) {
            this.clienteId = clienteId;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }
    }

    class Menu {
        String nome;
        String categoria;
        double valor; 

        Menu(String nome, String categoria, double valor, int itemID) {
            this.nome = nome;
            this.categoria = categoria;
            this.valor = valor;
        }
    }

    // Classe Pedido
    class Pedido {
        Cliente cliente;
        ArrayList<Menu> itens;
        double total;
        String status;

        Pedido(Cliente cliente) {
            this.cliente = cliente;
            this.itens = new ArrayList<>();
            this.total = 0.0;
            this.status = "Em preparação";
        }

        void adicionarItem(Menu item) {
            itens.add(item);
            total += item.valor;
        }

        void calcularTotal() {
            total = 0.0;
            for (Menu item : itens) {
                total += item.valor;
            }
        }

        void atualizarStatus(String novoStatus) {
            this.status = novoStatus;
        }

        String verificarStatus() {
            return this.status;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        restaurant restaurant = new restaurant();

        // Cadastro de clientes
        Cliente[] clientes = new Cliente[10];
        System.out.println("Digite o seu nome: ");
        clientes.nome = nextLine();

        System.out.println("Digite o seu endereço: ");
        clientes.endereco = nextLine();

        System.out.println("Digite o seu telefone: ");
        clientes.telefone = nextInt();

        // Menu do restaurante
        Menu[] menu = new Menu[5];
        menu[0] = restaurant.new Menu("Pizza", "Comida", 30.0, 1);
        menu[1] = restaurant.new Menu("Refrigerante", "Bebida", 5.0, 2);

        // Realização de pedido
        Pedido pedido = restaurant.new Pedido(clientes[0]);
        pedido.adicionarItem(menu[0]);
        pedido.adicionarItem(menu[1]);
        pedido.calcularTotal();

        // Acompanhamento de pedido
        System.out.println("Status do pedido: " + pedido.verificarStatus());
        pedido.atualizarStatus("Pronto para entrega");
        System.out.println("Status do pedido: " + pedido.verificarStatus());
        System.out.println("Total do pedido: R$ " + pedido.total);

        scanner.close();
    }
}

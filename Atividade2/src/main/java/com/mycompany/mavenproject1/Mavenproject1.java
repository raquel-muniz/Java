package com.mycompany.mavenproject1;

import com.mycompany.mavenproject.classes.Cliente;
import com.mycompany.mavenproject.classes.SistemaClientes;

public class Mavenproject1 {

public static void main(String[] args) {
        SistemaClientes sistema = new SistemaClientes();

        // Exemplo de cadastro de cliente
        Cliente cliente1 = new Cliente(1, "João", "joao@example.com", "123456789", "2023-04-06");
        sistema.cadastrarCliente(cliente1);

        // Listar clientes
        sistema.listarClientes();

        // Atualizar cliente
        sistema.atualizarCliente(1, "João Silva", "joaosilva@example.com", "987654321");

        // Excluir cliente
        sistema.excluirCliente(1);
    }
}
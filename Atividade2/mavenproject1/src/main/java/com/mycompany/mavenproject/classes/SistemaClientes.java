package com.mycompany.mavenproject.classes;

import java.util.ArrayList;
import java.util.List;


public class SistemaClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getClienteId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
            System.out.println("-----------------------------");
        }
    }

    public Cliente pesquisarClientePorId(int clienteId) {
        for (var cliente : clientes) {
            if (cliente.getClienteId() == clienteId) {
                return cliente;
            }
        }
        return null; // Cliente não encontrado
    }

    public void atualizarCliente(int clienteId, String novoNome, String novoEmail, String novoTelefone) {
        Cliente cliente = pesquisarClientePorId(clienteId);
        if (cliente != null) {
            cliente.setNome(novoNome);
            cliente.setEmail(novoEmail);
            cliente.setTelefone(novoTelefone);
            System.out.println("Dados do cliente atualizados com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public void excluirCliente(int clienteId) {
        Cliente cliente = pesquisarClientePorId(clienteId);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }
}

package com.mycompany.mavenproject.classes;

import java.sql.*;

public class ClienteADO {
    private Connection connection;

    public ClienteADO(Connection connection) {
        this.connection = connection;
    }

    public void adicionarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Clientes (Nome, Email, Telefone) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.executeUpdate();
        }
    }

    // Métodos para atualizar, deletar e buscar clientes
}

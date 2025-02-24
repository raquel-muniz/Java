package com.mycompany.principal;

import com.mycompany.mavenproject.classes.ClienteADO;
import com.mycompany.mavenproject.classes.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Rachel";
        String user = "root";
        String password = "catolica";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            ClienteADO clienteADO = new ClienteADO(connection);

            Cliente cliente = new Cliente(1, "João Silva", "joao.silva@example.com", "123456789", "Rua Exemplo, 123");

            clienteADO.adicionarCliente(cliente);
            System.out.println("Cliente adicionado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

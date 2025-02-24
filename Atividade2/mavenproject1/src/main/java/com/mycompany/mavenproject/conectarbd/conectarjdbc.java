package com.mycompany.mavenproject.conectarbd;

import java.sql.*;

public class conectarjdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Rachel";
        String user = "root";
        String password = "catolica";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Estabelecer a conexão
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");

            // Executar uma consulta
            String sql = "SELECT * FROM Clientes";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Processar os resultados
            while (rs.next()) {
                int id = rs.getInt("ID");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } finally {
            // Fechar recursos
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
    }
}

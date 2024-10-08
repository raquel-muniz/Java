import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class teste {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "catolica";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return connection;
    }

    public class Main {
        public static void main(String[] args) {
            Connection connection = teste.getConnection();
            // Realize operações no banco de dados aqui
        }
    }
}




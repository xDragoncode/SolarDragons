package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/solarDragons?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "anima123";

    // Carrega o driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver MySQL não encontrado!", e);
        }
    }

    /** Abre e retorna uma conexão com o BD */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }

    /** Fecha a conexão, se aberta */
    public static void close(Connection conn) {
        if (conn != null) {
            try { conn.close(); }
            catch (SQLException e) { e.printStackTrace(); }
        }
    }
}


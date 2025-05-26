package testclass;

import database.ConexaoMySQL;
import java.sql.Connection;

public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = ConexaoMySQL.getConnection();
        if (conn != null) {
            System.out.println("✅ Conexão com o MySQL realizada com sucesso!");
            ConexaoMySQL.close(conn);
        } else {
            System.out.println("❌ Falha na conexão com o banco.");
        }
    }
}

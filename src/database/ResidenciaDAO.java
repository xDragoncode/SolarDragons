package database;

import model.Residencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResidenciaDAO {

    public static List<Residencia> listarTodas() {
        List<Residencia> lista = new ArrayList<>();

        String sql = "SELECT * FROM residencias";

        try (Connection conn = ConexaoMySQL.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Residencia r = new Residencia();
                r.setId(rs.getInt("id"));
                r.setNome(rs.getString("nome"));
                r.setConsumoMensalKwh(rs.getDouble("consumo_mensal_kwh"));
                r.setTarifaEnergia(rs.getDouble("tarifa_energia"));
                r.setEconomiaEstimativa(rs.getDouble("economia_estimativa"));
                lista.add(r);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

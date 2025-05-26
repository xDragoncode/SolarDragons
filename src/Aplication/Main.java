package Aplication;

import database.ResidenciaDAO;
import model.Residencia;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Residencia> lista = ResidenciaDAO.listarTodas();

        for (Residencia r : lista) {
            System.out.println("ID: " + r.getId());
            System.out.println("Nome: " + r.getNome());
            System.out.println("Consumo: " + r.getConsumoMensalKwh() + " kWh");
            System.out.println("Tarifa: R$ " + r.getTarifaEnergia());
            System.out.println("Economia Estimada: R$ " + r.getEconomiaEstimativa());
            System.out.println("----------------------------");
        }
    }
}

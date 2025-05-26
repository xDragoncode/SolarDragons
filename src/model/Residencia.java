package model;

public class Residencia {
    private int id;
    private String nome;
    private double consumoMensalKwh;
    private double tarifaEnergia;
    private double economiaEstimativa;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getConsumoMensalKwh() { return consumoMensalKwh; }
    public void setConsumoMensalKwh(double consumoMensalKwh) { this.consumoMensalKwh = consumoMensalKwh; }

    public double getTarifaEnergia() { return tarifaEnergia; }
    public void setTarifaEnergia(double tarifaEnergia) { this.tarifaEnergia = tarifaEnergia; }

    public double getEconomiaEstimativa() { return economiaEstimativa; }
    public void setEconomiaEstimativa(double economiaEstimativa) { this.economiaEstimativa = economiaEstimativa; }
}

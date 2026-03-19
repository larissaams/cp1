package br.com.fiapride.model;
 
public class Veiculo {
    
    private String proprietario;
    private String placa;
    private double gasolina;
 
   
    public Veiculo(String proprietario, String placa) {
        this.setProprietario(proprietario);
        this.setPlaca(placa);
        this.setGasolina(0);
    }
 
    public String getProprietario() { return this.proprietario; }
    public String getPlaca() { return this.placa; }
    public double getGasolina() { return this.gasolina; }
 
    private void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
 
    private void setPlaca(String placa) {
        this.placa = placa;
    }
 
    private void setGasolina(double litros) {
        if (litros >= 0) {
            this.gasolina = litros;
        } else {
            System.out.println("Atençao: Não é possível ter gasolina negativa!");
        }
    }
 
    public void adicionarGasolina(double quantidade) {
        if (quantidade > 0) {
            this.gasolina += quantidade;
            System.out.println("Abastecido!! Gasolina disponivel: " + this.gasolina);
        }
    }
 
    public void gastarGasolina(double quantidade) {
        if (quantidade > 0 && this.gasolina >= quantidade) {
            this.gasolina -= quantidade;
            System.out.println("Viagem realizada!! Gasolina restante: " + this.gasolina);
        } else {
            System.out.println("Atençao: Gasolina insuficiente para inciar a corrida!");
        }
    }
}
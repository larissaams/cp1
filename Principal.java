package br.com.fiapride.main;
 
import br.com.fiapride.model.Veiculo;
 
public class Principal {
    public static void main(String[] args) {
        
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");
        v1.adicionarGasolina(50);
        v1.gastarGasolina(20);
 
        System.out.println("\nVeículo");
        System.out.println("Proprietario: " + v1.getProprietario());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Gasolina no carro: " + v1.getGasolina() + " litros");
    }
}
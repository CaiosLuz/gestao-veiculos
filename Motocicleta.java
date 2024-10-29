public class Motocicleta extends VeiculoBase{

    private double taxaSeguro;

    // Construtor

    public Motocicleta(String marca, String modelo, double precoBase, double taxaSeguro){
        super(marca, modelo, precoBase);
        this.taxaSeguro = taxaSeguro;
    }

    // Getters

    public double getTaxaSeguro(){
        return taxaSeguro;
    }

    public void setTaxaSeguro(double taxaSeguro){
        this.taxaSeguro = taxaSeguro;
    }

    // Métodos

    public double calcularPreco(){
        return precoBase + taxaSeguro;
    }

    public String toString(){
        return "Motocicleta Marca = " + marca + " - Modelo = " + modelo + " - Preço Base = " + precoBase  + " - Preço locação = " + calcularPreco() + ", preco taxa: " + taxaSeguro;
    }
}

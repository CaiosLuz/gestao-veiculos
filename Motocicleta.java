public class Motocicleta {
    private String marca;
    private String modelo;
    private double precoBase;
    private final double taxaSeguro;

    // Construtor

    public Motocicleta(String marca, String modelo, double precoBase, double taxaSeguro){
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
        this.taxaSeguro = taxaSeguro;
    }

    // Getters

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public double getTaxaSeguro(){
        return taxaSeguro;
    }

    // Setter

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    // Método calcularPreco() para calcular o valor da taxa de seguro mais o valor da locação

    public double calcularPreco(){
        return this.precoBase = taxaSeguro + precoBase;
    }

    public String toString(){
        return "Motocicleta[ Marca = " + marca + " - Modelo = " + modelo + " - Preço Locação = " + precoBase  + "]";
    }
}

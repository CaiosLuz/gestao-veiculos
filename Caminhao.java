public class Caminhao {
    private String marca;
    private String modelo;
    private double precoBase;
    private int taxaCarga;

    // Construtor

    public Caminhao(String marca, String modelo, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.precoBase = precoBase;
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

    public int getTaxaCarga(){
        return taxaCarga;
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

    public void setTaxaCarga(int taxaCarga){
        this.taxaCarga = taxaCarga;
    }

    public double calcularPreco(int taxaCarga){
        return this.precoBase = (precoBase * taxaCarga / 100) + precoBase;
    }

    public String toString(){
        return "Caminhão[ Marca = " + marca + " - Modelo = " + modelo + " - Preço Locação = " + precoBase  + "]";
    }
}

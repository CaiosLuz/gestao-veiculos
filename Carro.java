public class Carro {
    private String marca;
    private String modelo;
    private double precoBase;

    // Construtor

    public Carro(String marca, String modelo, double precoBase){
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
    
    // Método calcularPreco() para retornar o preço da locação sem alteração no valor

    public void calcularPreco(double precoBase){
        System.out.println("Preço da locação sem ajuste adicional: " + precoBase);
    }

    // Método definirPreco() para definir preço da locação

    public double definirPreco(double preco){
        return this.precoBase = preco;
    }

    // Retornar o objeto em forma de string com o toString

    public String toString(){
        return "Carro[ Marca = " + marca + " - Modelo = " + modelo + " - Preço Locação = " + precoBase  + "]";
    }
}

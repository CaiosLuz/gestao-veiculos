public abstract   class VeiculoBase {

    protected String marca;
    protected String modelo;
    protected double precoBase;
    protected double precoLocacao;

    public VeiculoBase(String marca, String modelo, double precoBase){
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

    public double getPrecoLocacao(){
        return precoLocacao;
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

    public void setPrecoLocacao(double precoLocacao){
        this.precoLocacao = precoLocacao;
    } 

    // Métodos

    public abstract double calcularPreco();
}

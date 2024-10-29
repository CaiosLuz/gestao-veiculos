public class Caminhao extends VeiculoBase{
    private int taxaCarga;

    // Construtor

    public Caminhao(String marca, String modelo, double precoBase, int taxaCarga){
        super(marca, modelo, precoBase);
        this.taxaCarga = taxaCarga;
    }

    // Getters

    public int getTaxaCarga(){
        return taxaCarga;
    }

    // Setter

    public void setTaxaCarga(int taxaCarga){
        this.taxaCarga = taxaCarga;
    }

    // Métodos

    @Override
    public double calcularPreco(){
        return this.precoLocacao = this.precoBase + (this.precoBase * this.taxaCarga);
    }

}

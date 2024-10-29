public class Carro extends VeiculoBase{

    // Construtor

    public Carro(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularPreco(){
        return this.precoLocacao = this.precoBase;
    }
}

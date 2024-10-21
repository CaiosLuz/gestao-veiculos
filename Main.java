public class Main{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Palio", 500.0);
        Caminhao caminhao1 = new Caminhao("Volvo", "Truck02", 100.0);
        Motocicleta motocicleta1 = new Motocicleta("Honda", "CG 160 Titan", 100.0, 30.50);

        carro1.definirPreco(502.40);
        caminhao1.calcularPreco(10);
        System.out.println(motocicleta1.calcularPreco());

        System.out.println(carro1.toString());
        System.out.println(caminhao1.toString());
        System.out.println(motocicleta1.toString());
    }
}
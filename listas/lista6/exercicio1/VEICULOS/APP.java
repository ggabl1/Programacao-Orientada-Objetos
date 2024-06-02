package VEICULOS;

public class APP {
    public static void main(String[] args){
        carro carro = new carro("ronda", 2012);
        skate skate = new skate("long board", 199.90);

        carro.acelerar();
        carro.frear();
        skate.acelerar();
        skate.frear();
    }
}

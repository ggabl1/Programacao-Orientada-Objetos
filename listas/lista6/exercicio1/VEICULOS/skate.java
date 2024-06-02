package VEICULOS;

public class skate implements VEICULO {

    @Override
    public void acelerar() {
        System.out.println("slash slash");
    }
    @Override
    public void frear() {
        System.out.println("tchhhhh");
    }
    private String tipo;
    private double preco;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public skate(String tipo, double preco){
        this.tipo = tipo;
        this.preco = preco;
    }
}

package VEICULOS;

public class carro  implements VEICULO{
    @Override
    public void acelerar() {
        System.out.println("vrummm");
    }
    @Override
    public void frear() {
        System.out.println("frrrr");
    }
    private String marca;
    private int ano;

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
}

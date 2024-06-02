package ANIMAIS;

public class gato implements animal {
    @Override
    public void comer() {
        System.out.println("nhacr cr nhacr cr nhacr cr");
    }
    @Override
    public void emitirSom() {
        System.out.println("meow");
    }

    private String cor;
    private int idade;

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public gato(String cor, int idade){
        this.cor = cor;
        this.idade = idade;
    }
}

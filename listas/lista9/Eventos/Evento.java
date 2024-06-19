package Eventos;
public class Evento{
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data){
        this.nome;
        this.local;
        this.data;
    }

    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(local);
        System.out.println(data);
    }

    public abstract void comecarEvento(){
        System.out.println("la laia la laia laia");
    }

    public void setNome(){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setLocal(){
        this.local = local;
    }
    public String getLocal(){
        return this.local;
    }
    public void setData(){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}
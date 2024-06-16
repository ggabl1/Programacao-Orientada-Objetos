package Loja;
public class Produto{
    private String nome;
    public double preco;

    public Produto(String nome, double preco)throws NomeINomeInvalidoExeption, PrecoInvalidoExeption;
        setNome(nome);
        setPreco(preco);
    }

    public String setNome()throws NomNomeInvalidoExeption(){
        return this.nome;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    throw new NomeInvalidoExeption();

    public double setPreco()throws PPrecoInvalidoExeption(){
        return this.preco;
    }
    public void getPreco(double preco){
        this.preco = preco;
    }
    throw new PrecoInvalidoExeption();
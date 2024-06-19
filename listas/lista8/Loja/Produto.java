import Exceptions.NomeInvalidoException;
import Exceptions.PrecoInvalidoException;

public class Produto{
    private String nome;
    public double preco;

    public Produto(String nome, double preco)throws NomeInvalidoException, PrecoInvalidoException{
        setNome(nome);
        setPreco(preco);
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if (nome.length() > 3){
            throw new NomeInvalidoException();
        }
        else{
              this.nome = nome;
          }
      }
    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco) throws PrecoInvalidoException{
        if (preco <= 0){
            throw new PrecoInvalidoException();
        }
        else{
        this.preco = preco;
        }
    }
    public double getPreco(){
        return this.preco;
    }
}
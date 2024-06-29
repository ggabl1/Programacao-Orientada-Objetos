import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return this.diretor;
    }

    public void setAtores(String atores){
        this.atores = atores;
    }
    public List<String> getAtores(){
        return this.atores;
    }
    
    public void exibirInfo(){
        System.out.println(titulo + "" + diretor + "" + atores);
    }
    public Filme(String titulo, String diretor, List<String>atores){
        this.titulo;
        this.diretor;
        this.atores;
}
}

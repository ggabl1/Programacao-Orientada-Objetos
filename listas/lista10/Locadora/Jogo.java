public class Jogo implements AudioVisual {
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma){
        this.titulo;
        this.plataforma;
    }
    public void exibirInfo(){
        System.out.println(titulo + "" + plataforma);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setplataforma(String plataforma){
        this.plataforma = plataforma;
    }
    public String getPlataforma(){
        return this.plataforma;
    }
}

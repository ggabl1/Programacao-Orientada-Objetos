import java.util.*;

public class BibliotecaMusical {
    public boolean encontrou = false;
    private <String, Musica> acervo = new LinkedHashMap<>();

    public void adicionarMusica(String titulo, Musica musica){
        musicas.put(musica.getTitulo(), musica);
    }

    public void listarMusicas(){
        for(musica musica : acervo){
            System.out.println(musica.getTitulo);
        }
    }

    public String buscarMusica(String titulo) throws MusicaNaoEncontradaException{
        if (encontrou){
            throw new MusicaNaoEncontradaException();
        }
        else{
        return this.musicas.getTitulo();
        }
    }
    public void setAcervo(String acervo){
        this.acervo = acervo;
    }
    public String acervo(){
        return this.acervo;
    }
}

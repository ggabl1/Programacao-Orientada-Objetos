import java.util.List;

public class Locadora<T extends AudioVisual>{
    private List<T> acervo;

    public void adicionarItem(T item){
        acervo.add(item);
    }
    public void listarItens(){
      for (item item : acervo){
        System.out.println(item.getTitulo);
      }
    }
    public T buscarItem(String titulo){
        for (item item : acervo){
            if(getTitulo() == titulo){
                System.out.println(item);
            }
        }
     //Busca um item audiovisual pelo título e retorna o item encontrado. (É necessário realizar cast para
    //utilizar o método getTitulo() para comparar o titulo recebido
    //com o do Filme/Jogo)
    }

    public void setAcervo(T acervo){
        this.acervo = acervo;
    }
    public T getAcervo(){
        return this.acervo;
    }

}

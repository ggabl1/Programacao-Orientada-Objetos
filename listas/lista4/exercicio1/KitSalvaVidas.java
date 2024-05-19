public class KitSalvaVidas {
    int tamanho;
    String nivelDoKit;
    boolean ehTermico;
    public String utilizar(){
        if (nivelDoKit == "bronze"){
            System.out.println("carregando vida. Isso pode demorar um pouco");
        }
        else if (nivelDoKit == "prata"){
            System.out.println("carregando vida");
        }
        return "vida recarregada";
    }
    public String guardar(){
        if (tamanho > 2){
            System.out.println("não eh possivel guardar no inventario");
        }
        return "item guardado";
    }
    public String queimar(){
        if (ehTermico){
            System.out.println("o item foi preservado");
        }
        return "o item foi incinerado";
    }
    public void exibir(){
        System.out.println(" tamanho do kit: " + tamanho +  " nivel: " + nivelDoKit +  " eh termico? " + ehTermico);
    }
}
public class AudioVisual{
    private int quantidadeCds;
    private String nomeCd;

    public void setquantidadeCds(int quantidadeCds){
        this.quantidadeCds = quantidadeCds;
    }
    public int getQuantidadeCds(){
        return this.quantidadeCds;
    }
    public void setNomecd(String nomeCd){
        this.nomeCd = nomeCd;
    }
    public String getNomecd(){
        return this.nomeCd;
    }

    public void exibirInfo(){
        System.out.println(quantidadeCds + "" + nomeCd);
    }
}
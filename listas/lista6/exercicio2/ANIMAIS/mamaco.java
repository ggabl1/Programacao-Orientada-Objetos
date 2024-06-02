package ANIMAIS;

public class mamaco implements animal {
    @Override
    public void comer() {
        System.out.println("nham nham nham");
    }
    @Override
    public void emitirSom() {
        System.out.println("uh uh ah ah");
    }
    private String especie;
    private String membroFamilia;

    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return this.especie;
    }

    public void setMembroFamilia(String membroFamilia){
        this.membroFamilia = membroFamilia;
    }
    public String getMembroFamilia(){
        return this.membroFamilia;
    }

    public mamaco(String especie, String membroFamilia){
        this.especie = especie;
        this.membroFamilia = membroFamilia;
    }
}

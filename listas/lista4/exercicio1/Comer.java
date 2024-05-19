public class Comer {
    int Saude=0;
    boolean ehdoce;
    int QuantidadeDeVidaRecarregada;
    public void doceOuSalgado(){
        if (ehdoce) {
            System.out.println("O que voce comeu é doce: voce ganhou +2 de agilidade");
        }
    }
    public void nivelDeSaude(){
        Saude++;
    }
    public void exibir(){
        System.out.println(" eh doce? " + ehdoce + " eh saudavel? " + Saude);
    }
}

public class TartarugaNinja {
    String nome;
    int nivel;
    int kitSalvaVidas = 5;
    int vida = 10;

    public void comer() {
        if (vida < 10) {
            System.out.println("recuperando vida...");
            vida++;
        }
    }

    public void desviarDoAtaque() {
        if(nivel > 2){
        System.out.println("uff... essa foi quase");
        }
        else{
            System.out.println("voce foi golpeado");
            vida--;
        }
    }

    public void salvarAmigo() {
        kitSalvaVidas = kitSalvaVidas - 1;
        System.out.println("Voce usou o kit de salva vidas");
    }

    public void exibir() {
        System.out.println(" nome: " + nome + " nivel: " + nivel + " kitSalvaVidas: " + kitSalvaVidas + " vidas " + vida);
    }
}
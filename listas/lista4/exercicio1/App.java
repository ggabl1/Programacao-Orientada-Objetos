import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner SCAN = new Scanner(System.in);
        TartarugaNinja tartaruga = new TartarugaNinja();
        tartaruga.nome = SCAN.nextLine();
        tartaruga.nivel = 0;
        tartaruga.vida = 10;
        tartaruga.kitSalvaVidas = 1;
        tartaruga.exibir();
        KitSalvaVidas kit = new KitSalvaVidas();
        kit.tamanho = 12;
        kit.ehTermico = false;
        kit.nivelDoKit = "bronze";
        kit.exibir();
        Comer comer = new Comer();
        comer.QuantidadeDeVidaRecarregada = 1;
        comer.Saude = 2;
        comer.ehdoce = false;
        comer.exibir();
    }
}

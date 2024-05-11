import java.util.*;
public class Program{
    double notaDada = 0;
    public static int quantidadeDeNotas = 3;
    private static final double notas[] = new double[quantidadeDeNotas];
    private static final Scanner SCAN = new Scanner(System.in);
    public static void avaliar(double notaDada){
        for(int i = 0; i < quantidadeDeNotas; i++){
        System.out.println("ditite a avaliaçao ");
        notaDada = Integer.parseInt(SCAN.nextLine());
        notas[i] = notaDada;
        }
    }
    public static void calcularEImprimir(){
        double somatorio = 0;
        for(int posicao = 0; posicao < quantidadeDeNotas; posicao++){
            somatorio = somatorio + notas[posicao];
        }
        double media = somatorio / quantidadeDeNotas;
        
        System.out.println(Math.round(media));
    }
    public static void main(String[] args){
        avaliar(quantidadeDeNotas);
        calcularEImprimir();
    }
}
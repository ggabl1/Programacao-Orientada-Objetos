import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int tamanhoVetor = 10;

    public static void main(String[] args) {
        int[] Vetor = new int[tamanhoVetor];
        PreencherNumeros(Vetor);
        System.out.println("digite o numero: ");
        int numero = Integer.parseInt(SCAN.nextLine());
        verificaNumeros(Vetor, numero);
    }

    public static void PreencherNumeros(int[] Vetor){
        System.out.println("digite numeros: ");
        for(int i = 0; i < 10; i++){
        Vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void verificaNumeros(int[] vetor, int numero) {
        boolean temNoVetor = false;
        for (int j = 0; j < 10; j++) {
            if (vetor[j] == numero) {
                temNoVetor = true;
            }
        }
        if(temNoVetor){

            System.out.println("ACHEI");
        }
        else{
            System.out.println(" NAO ACHEI");
        }
    }
}
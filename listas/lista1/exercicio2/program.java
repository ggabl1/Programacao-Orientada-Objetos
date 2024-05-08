import java.util.*;

public class program {
    private static  boolean[][] matriz = new boolean[4][4];
    private static Scanner SCAN = new Scanner(System.in);

    static boolean percorrerMatriz(boolean matriz[][]) {
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = false;
            }
        }
        return false;
    }

    static void verificarLocal(int localLinha, int localColuna) {
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[localLinha][localColuna] = true;
            }
        }
    }

    static void ImprimirMatriz() {
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (matriz[linha][coluna] == true) {
                    System.out.print("O");
                } else if (matriz[linha][coluna] == false) {
                    System.out.print("X");
                }
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        percorrerMatriz(matriz);
        verificarLocal(Integer.parseInt(SCAN.nextLine()), Integer.parseInt(SCAN.nextLine()));
        ImprimirMatriz();
    }
}

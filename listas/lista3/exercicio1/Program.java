import java.util.*;

public class Program {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int anoAtual = 2024;
    public static int calcularIdade(int dataNascimento){
        int idadeAtual = anoAtual - dataNascimento;
        System.out.println("Até o fim de 2024 voce tera " + idadeAtual + " anos");
        return idadeAtual;
    }
    public static void main(String[] args){
        System.out.println("digite sua data de nascimento ");
        int dataNascimento = Integer.parseInt(SCAN.nextLine());
        calcularIdade(dataNascimento);
    }
}
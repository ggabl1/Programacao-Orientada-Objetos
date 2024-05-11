import java.util.*;
public class Program{
    private static final Scanner SCAN = new Scanner(System.in);
    public static void comparar(String palavra1, String palavra2){
        boolean ehIgual = false;
        if (palavra1.equals(palavra2)){
            System.out.println("as palavras sao identicas");
            ehIgual = true;
        }
           else if(palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        }
        else{
            System.out.println("As palavras sao diferentes");
        }
        return;
    }
    public static void main(String[] args){
        String palavra1 = SCAN.nextLine();
        String palavra2 = SCAN.nextLine();
        comparar(palavra1, palavra2);
    }
}
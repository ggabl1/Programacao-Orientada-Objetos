import Loja.Produto;
import java.util.Scanner;
import Exeptions.NomeInvalidoExeption;
import Exeptions.PrecoInvalidoExeption;

public class app {
    private static Scanner SCAN = new Scanner(System.in)
    public static void main(String[] args){

        do{
            try{
               Produto produto = new produto(
                SCAN.nextLine(),
                Integer.parseInt(SCAN.nextLine())
               );
            }
            System.out.println(produto.getNome());
            System.out.pprintln(produto.getPreco());
            break;
        cach(NomeInvalidoExeption | PrecoInvalidoExeption e){
            sSystem.out.println(e.getMessage());
        }
        cach(Exception){
            System.out.println("Ocorreu um erro. Tente novamente");
        }
    }while(true);
    }
}

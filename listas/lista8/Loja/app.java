import java.util.Scanner;
public class app {
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args){

        do{
            try{
               Produto produto = new Produto(SCAN.nextLine(),Double.parseDouble(SCAN.nextLine()));
                System.out.println(produto.getNome());
                System.out.println(produto.getPreco());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            break;
    }while(true);
    }
}

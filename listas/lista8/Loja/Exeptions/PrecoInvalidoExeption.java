package Exeptions;

public class PrecoInvalidoExeption extends Exeptions{
    public void PrecoInvalidoExeption(){
        if (preco <= 0){
            super("o preço não pode ser menor ou igual a 0!");
        }
      }
}

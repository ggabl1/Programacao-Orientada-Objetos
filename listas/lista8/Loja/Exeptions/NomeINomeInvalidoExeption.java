package Exeptions;

public class NomeINomeInvalidoExeption extends Exeptions{
    public void NomeInvalidoExeption(){
        String NomeProduto;
        char[] charArray = new char[3];
        for (int i = 0; i < NomeProduto.length(); i++) {
          charArray[i] = NomeProduto.charAt(i);
          if (i > 3){
            super("o nome deve conter apenas 3 letras!");
          }
        }
      }
}

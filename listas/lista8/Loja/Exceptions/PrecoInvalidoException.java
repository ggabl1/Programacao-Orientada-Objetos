package Exceptions;
public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("o preço não pode ser menor ou igual a 0!");
      }
}

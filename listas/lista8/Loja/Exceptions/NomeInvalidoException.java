package Exceptions;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
      super("o nome deve conter apenas 3 letras!");
}
}
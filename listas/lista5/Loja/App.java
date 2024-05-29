package Loja;
import java.util.*;
public class App {
    public static void main(String[] args){
        Loja loja = new Loja(270, "Suzano-Gato Cinczento 344", "08h - 19h");
        Produto produto = new Produto("vassoura", 19.99, 10 );
        loja.adicionarProduto(produto); 
        loja.imprimirLoja();
        produto.imprimirProduto();
    }
}

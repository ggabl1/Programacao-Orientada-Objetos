package Loja;

import javax.sound.sampled.SourceDataLine;

public class Produto {
        private String nome;
        private double preco;
        private int quantidade;
        private boolean jaFoiVendido = false;
        public void setPreco(double preco){

                this.preco = preco;
        }
        public double getPreco(){
                return this.preco;
        }
        public void setQuantidade(int quantidade){
                this.quantidade = quantidade;
        }
        public double getQuantidade(){
                return this.quantidade;
        }
        public void setNome(String nome){
                this.nome = nome;
        }
        public String getNome(){
                return this.nome;
        }
        public void setjaFoiVendido(boolean jaFoiVendido){
                this.jaFoiVendido = jaFoiVendido;
        }
        public boolean getjaFoiVendido(){
                return this.jaFoiVendido;
        }
        public Produto(String nome, Double preco, int quantidade){
                this.nome = nome;
                this.preco = preco;
                this.quantidade = quantidade;
        }
        public void imprimirProduto(){
        System.out.println("nome do produto: " + nome + "\npreço: " + preco + "\nquantidade disponível: " + quantidade + "\nnão tem no estoque: " + jaFoiVendido);
        }
}

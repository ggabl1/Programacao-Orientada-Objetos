package Loja;

import java.util.ArrayList;

public class Loja {
        private String nome;
        private int produtosDisponiveis;
        private String local;
        private String horariosDeFuncionamento;
        private ArrayList<Produto> listaDeProduto = new ArrayList<>();

        public void setNome(String nome) {
                if (nome.isBlank()) {
                        System.out.println("loja nao identificada");
                } else {
                        this.nome = nome;
                }
        }

        public String getNome() {
                return this.nome;
        }

        public void setProdutosDisponiveis(int produtosDisponiveis) {
                this.produtosDisponiveis = produtosDisponiveis;
        }

        public int getProdutosDisponiveis() {
                return this.produtosDisponiveis;
        }

        public void setLocal(String local) {
                this.local = local;
        }

        public String getLocal() {
                return this.local;
        }

        public void setHorariosDeFuncionamento(String horariosDeFuncionamento) {
                this.horariosDeFuncionamento = horariosDeFuncionamento;
        }

        public String getHorariosDeFuncionamento() {
                return this.horariosDeFuncionamento;
        }

        public Produto venderProduto(Produto produto) {
                if (produto.getjaFoiVendido()) {
                        System.out.println("o produto nao esta mais disponivel :/");
                }
                return produto;
        }

        public void adicionarProduto(Produto produto) {
                listaDeProduto.add(produto);
        }
        public Loja(int produtosDisponiveis, String local, String horariosDeFuncionamento){
                this.produtosDisponiveis = produtosDisponiveis;
                this.local = local;
                this.horariosDeFuncionamento = horariosDeFuncionamento;
        }
        public void imprimirLoja(){
        System.out.println("nome da loja: " + nome + "\nquantidades de produtos disponiveis: " + produtosDisponiveis + "\nendereço: " + local + "\nhorarios de funcionamento: " + horariosDeFuncionamento + "\nprodutos: " + listaDeProduto);
        }
}

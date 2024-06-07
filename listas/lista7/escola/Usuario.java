package escola;

public class Usuario{
    private String nome;
    private String e_mail;

    public Usuario(String nome, String e_mail){
        this.nome = nome;
        this.e_mail = e_mail;
    }

    public void exibirInfo(){
        System.out.println(nome + "\n"+ e_mail);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setE_mail(String e_mail){
        this.e_mail = e_mail;
    }
    public String getE_mail(){
        return this.e_mail;
    }
}
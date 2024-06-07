package escola;
import escola.Usuario;
public class Professor extends Usuario {
    private String disciplina;

    public class Professor(String nome, String e_mail, String disciplina){
        this.nome = nome;
        this.e_mail = e_mail;
        this.disciplina = disciplina;
    }
    @override
    public void exibirInfo(){
        System.out.println(nome + "\n" + e_mail + "\n" + disciplina);
    }

    public void exibirInfo(boolean nome, boolean e_mail, boolean disciplina){
        if(nome){
            System.out.println(nome);
        }
        else if (this.e_mail){
            System.out.println(e_mail);
        }
        else if (this.disciplina){
            System.out.println(disciplina);
        }
    }

    public void disciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String disciplina(){
        return this.disciplina;
    }
}

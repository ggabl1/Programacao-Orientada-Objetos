package escola;
import Usuario;
public class Aluno extends Usuario{
    private String matricula;

    public class Aluno(String nome, String e_mail, String matricula){
        this.nome = nome;
        this.e_mail = e_mail;
        this.matricula = matricula;
    }
    @override
    public void exibirInfo(){
        System.out.println(nome + "\n" + e_mail +"\n" + matricula);
    }
    public void exibirInfo(boolean nome, boolean e_mail, boolean matricula){
        if (this.nome){
            System.out.println(nome);
        }
        else if (this.e_mail){
            System.out.println(e_mail);
        }
        else if (this.matricula){
            System.out.println(matricula);
        }
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
}

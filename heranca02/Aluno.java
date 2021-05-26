package heranca02;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno");
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }


}

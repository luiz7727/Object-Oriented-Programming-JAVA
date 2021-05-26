package heranca;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    //extends(extender ou ampliar) estou ampliando características da outra Classe.
    public void cancelarMatricula()
    {
        System.out.println("Matricula cancelada");
    }

    public int getMatr()
    {
        return matr;
    }

    public void setMatr(int matr)
    {
        this.matr = matr;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
}

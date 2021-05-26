package heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho()
    {

    }

    public String getSetor()
    {
        return this.setor;
    }

    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public boolean getTrabalhando()
    {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando)
    {
        this.trabalhando = trabalhando;
    }


}

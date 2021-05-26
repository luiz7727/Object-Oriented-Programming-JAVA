package heranca;

public class Pessoa {
    //Progenitora
    //Supeclasse
    private String nome;
    public int idade;
    public String sexo;

    public void fazerAniver()
    {
        this.idade++;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
}

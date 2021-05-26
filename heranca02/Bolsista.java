package heranca02;

public class Bolsista extends Aluno{
    private float bolsa;

    public float getBolsa(){
        return this.bolsa;
    }

    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }

    public void RenovarBolsa(){

    }

    //Override(Sobrepor)
    //Para um aluno paga mensalidade de um jeito para um bolsista paga de outro
    public void PagarMensalidade(){

    }
    //Polimorfismo = fazer coisas diferentes, uma coisa que tenha o mesmo nome de maneira diferentes.Por exemplo o Sobrepor acima
}

package Aula03;

public class Caneta03 {
    //Atributos(características)
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //this é uma referencia oa próprio objeto que chamou
    //void significa sem retorno
    //Métodos
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("error");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada = false;
    }
    //mostrando o status

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor );
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }


}

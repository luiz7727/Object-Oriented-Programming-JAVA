package Aula02;

public class Caneta {
    //Atributos(características)
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //this é uma referencia oa próprio objeto que chamou
    //void significa sem retorno
    //Métodos
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("error");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
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

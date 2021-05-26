package Aula04;

public class Caneta04 {
    public String modelo;
    private float ponta;
    public boolean tampada;
    private String cor;


    public Caneta04(String m, String c, float p){ // este é o método Construct
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        //this.cor = "Azul";
    }


    //todo método get e set é publico
    public String getModelo(){
        return this.modelo;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.tampada);
    }


}


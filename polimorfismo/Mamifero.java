package polimorfismo;

public class Mamifero extends Animal{
    String corPelo;
    private float peso;

    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de corno");
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

}

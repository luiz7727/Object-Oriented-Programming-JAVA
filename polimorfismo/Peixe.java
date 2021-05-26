package polimorfismo;

public class Peixe extends Animal{
    public String corEscama;

    public void soltarBolha(){

    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBola(){
        System.out.println("Soltou uma bolha");
    }
}

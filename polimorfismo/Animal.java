package polimorfismo;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected String membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}

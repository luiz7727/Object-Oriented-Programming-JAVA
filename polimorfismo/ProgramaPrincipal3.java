package polimorfismo;

public class ProgramaPrincipal3 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3f);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBola();

        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();

        Canguru c = new Canguru();
        Cachorro k =  new Cachorro();

        c.locomover();
        k.locomover();

    }
}

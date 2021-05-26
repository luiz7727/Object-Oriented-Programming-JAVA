package heranca02;

public class ProgramaPrincipal02 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pesso();
        //A classe Pessoa é abstrata, então não pode ser instanciada.
        Visitante v1 = new Visitante();
        v1.setNome("Robson");
        v1.setIdade(22);
        v1.setSexo("M");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(122);
        //Aluno a1 = new Aluno();
    }
}

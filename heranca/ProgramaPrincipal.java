package heranca;

public class ProgramaPrincipal {
    public static void main(String[]args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();


        //Mesmo não tendo o setNome na classe do ALuno, extendendo a classe Pessoa na classe Aluno, eu consigo pegar os métodos da Classe Pessoa
        p2.setNome("ale");
        p3.setNome("Cleitin");

        

    }
}

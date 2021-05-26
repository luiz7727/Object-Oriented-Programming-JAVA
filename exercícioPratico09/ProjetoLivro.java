package exercícioPratico09;

public class ProjetoLivro {
    public static void main(String[]args){
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro",22,"M");
        p[1] = new Pessoa("Maria",25,"F");

        l[0] = new Livro("Aprendendo a jogar","luiz",3,p[0]);



    }
}

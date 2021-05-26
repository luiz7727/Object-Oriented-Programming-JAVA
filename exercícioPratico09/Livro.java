package exercícioPratico09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int PagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.PagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return this.PagAtual;
    }

    public Boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void setPagAtual(int pagAtual) {
        this.PagAtual = pagAtual;
    }

    public String detalhes() {
        return "Boa leitura";
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo o livro...");
        this.aberto = true;
    }

    @Override
    public void fechar() {
        System.out.println("Fechando...");
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.PagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.PagAtual++;
    }

    @Override
    public void voltarPag() {
        this.PagAtual--;
    }


}


package Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){//construct
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public void apresentar(){
        System.out.println("CHEGOU A HORA!! APRESENTAMOS O LUTADOR...");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos" );
        System.out.println("Peso:" + getPeso());
        System.out.println("Categoria: "+ getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: "+ getDerrotas());
        System.out.println("Empate: " + getEmpates());
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return  this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria(){
        return  this.categoria;
    }

    private void setCategoria(){
        if(this.peso<52.2){
            this.categoria = "Inválido";
        }else if(this.peso<= 70.3){
            this.categoria = "leve";
        }else if(this.peso<= 83.9){
            this.categoria = "Médio";
        }else if(this.peso<= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return this.empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());

    }

    public void ganharLuta(){
        this.setVitorias(getVitorias()+ 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }

}


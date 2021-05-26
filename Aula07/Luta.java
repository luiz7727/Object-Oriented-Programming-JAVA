package Aula07;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        }else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// vai gerar um valor de  0 ate 2 que na realidade sao 3 numero(0,1,2)
            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Venceu" +this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                case 2:
                    System.out.println("Venceu" + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

            }


        }else{
            System.out.println("A luta nao pode acontecer");
        }
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRound(){
        return this.rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;

    }

    public boolean getAprovado(){
        return this.aprovada;
    }

    public void setAprovado(boolean aprovado){
        this.aprovada = aprovado;
    }
}

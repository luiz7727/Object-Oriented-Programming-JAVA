package Aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public int getVolume(){
        return volume;
    }
    public void setVOlume(int volume){
        this.volume = volume;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setLigado(boolean ligado){
       this.ligado = ligado;
    }
    public boolean getTocando(){
        return tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //métodos abistratos
    //Override significa sobrescrever
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i<= this.getVolume(); i +=10 ){
            System.out.print("||");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVOlume() {
        if(this.getLigado()){
            this.setVOlume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVOlume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVOlume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVOlume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVOlume(0);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVOlume(50);
        }
    }

}

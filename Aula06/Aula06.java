package Aula06;

public class Aula06 {
    public static void main(String[]args){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVOlume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
        //Não consgio acessar direto pois eles estão encapsulados
        //c.setVolume(50);
        //c.volume();

    }
}

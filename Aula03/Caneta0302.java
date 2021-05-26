package Aula03;

import Aula03.Caneta03;

public class Caneta0302 {
    public static void main(String[]args){
        //instanciando a class Caneta
        Caneta03 c1 = new Caneta03();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
}

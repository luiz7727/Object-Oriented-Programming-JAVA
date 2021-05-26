package Aula02;

public class Caneta2 {
    public static void main(String[]args){
        //instanciando a class Caneta
        Caneta c1 = new Caneta();

        //chamando atributo
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        //chamando um método
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "robson";
        c2.cor = "arroz";
        c2.destampar();
        c2.rabiscar();
        c2.status();

    }
}

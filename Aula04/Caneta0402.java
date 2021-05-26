package Aula04;

public class Caneta0402 {
    public static void main(String[]args){
        Caneta04 c1 = new Caneta04("nic","arroz",0.4f);

        c1.setModelo("BIC");
        c1.modelo = "BIC";
        //Dessa forma de cima como o atributo é public eu consigo setar o valor acessando ele

        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        //Dessa forma pois o atributo pnta é privado, não consigo acessar ele direto, então tenho que usar um método para poder setar um valor
        //Não consigoa cessar diretamente o atributo.
        c1.status();
        System.out.println("Tenho uma caneta " + c1.getPonta());
        //System.out.println("Tenho uma caneta " + c1.ponta); desse modo está errado pois o atributo ponta é privado.


    }
}

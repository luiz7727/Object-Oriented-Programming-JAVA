package Aula07;

public class UltraEmojiCombat {
    public static void main(String[]args){
        //Lutador l = new Lutador();
        //Se eu chamar o construtor sem parametro, o código reclama

        //Lutador l = new Lutador("Robson","Egito",18,1.95f,58f,9,0,4);
        //l.apresentar();

        //trabalhando com vetores na crição de mais lutadores
        Lutador l[] = new Lutador[6];
        //O vetor terá 6 posições
        //O primeiro lutador
        l[0] = new Lutador("Robson","Egito",98,1.95f,58f,9,0,4);
        l[1] = new Lutador("Carlos","Brasil",38,1.95f,58f,9,0,4);
        l[2] = new Lutador("Eduardo","Uruguai",28,1.95f,58f,9,0,4);
        l[3]= new Lutador("Rolim","Porra",16,1.95f,58f,9,0,4);
        l[4] = new Lutador("Ryan","Egito",58,1.95f,58f,9,0,4);

        l[3].status();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[2],l[4]);
        UEC01.lutar();

    }
}

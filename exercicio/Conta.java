package exercicio;

public class Conta {
    //atributos(características)
     public int numConta;
     protected String tipoConta;
     private String dono;
     private double saldo;
     private boolean status;

     public void estadoAtual(){
         System.out.println("---------------------------------");
         System.out.println("Conta " + this.getnumConta());
         System.out.println("Dono " + this.getDono());
         System.out.println("Tipo: " + this.getTipo());
         System.out.println("Saldo: " + this.getSaldo());
         System.out.println("Status: " + this.getStatus(true));
     }
     //método construct
    public Conta(){
        this.status = true;
        this.saldo = 0;
    }
    //métodos(funções)
    public void abrirConta(String t){
        this.setTipo(t);
        this.getStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada,pois tem dinheiro");
        }else if(this.getSaldo() <0 ){
            System.out.println("Conta não pode ser fechada,pois tem débito");
        }else{
            this.getStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getnumConta(){
        return this.numConta;
    }

    public void depositar(float v){
        if(this.getStatus(true)){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if(this.getStatus(true)){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() =="CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus(true)){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidae paga com sucesso por " + this.getDono());
        }else{
            System.out.println("IMpossível pagar uma conta fecahda");
        }
    }
    public String getTipo(){
        return this.tipoConta;
    }

    public void setTipo(String t ){
        this.tipoConta = t;
    }
    public void setDono(String nome){
        this.dono = nome;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double saldo ){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public boolean getStatus(boolean acesso){
        return this.status;
    }
    public void isStatus(boolean s){
        this.status = s;
    }

}
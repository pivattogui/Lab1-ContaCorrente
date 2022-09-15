package banco;

public class Conta {
    private double saldo = 0;
    private String numero;


    //REALIZA DEPÓSITO BANCÁRIO
    public void depositar(double valor){
        if(valor <= 0)
            System.out.println("Selecione um valor maior que R$0,00 para realizar o depósito");
        else
            saldo = saldo + valor;
        System.out.println("Saldo da conta atualizado\nVocê possuí R$" + saldo);
    }

    //REALIZA SAQUES BANCÁRIO
    public void sacar(double valor){
        if(valor > saldo) {
            System.out.println("Você não possuí saldo suficiente para o saque. Saldo disponível de R$" + saldo);
        }else {
            saldo = saldo - valor;
            System.out.println("Saldo da conta atualizado\nVocê possuí R$" + saldo);
        }
    }

    //MÉTODO toString, FALA SALDO
    public String toString(){
        return "R$" + saldo;
    }

    //CONSTRUTOR
    public Conta(String nome){
        this.numero = numero;
    }

    //INFORMA GET NÚMERO DA CONTA
    public String getNumero(){
        return numero;
    }
}

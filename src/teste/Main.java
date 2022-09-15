package teste;

import banco.Conta;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta("ContaTeste");
        conta.depositar(400.5);
        System.out.println(conta.toString());

        conta.sacar(300);
        System.out.println(conta.toString());

    }
}

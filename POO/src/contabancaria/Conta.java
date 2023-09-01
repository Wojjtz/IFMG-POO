/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author 0057149
 */
public class Conta {

    String titular;
    String numero;
    double saldo;

    public void consultarInformacoes() {
        System.out.println("Titular: " + this.titular + "\nNúmero: " + this.numero + "\nSaldo: R$" + this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Valor depositado: R$" + valor + "\nSaldo atual: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Valor sacado: R$" + valor + "\nSaldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo indiponível. \nSaldo atual: R$ " + this.saldo);
        }
    }

    public void transferir(Conta destino, double valor) {
        
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.saldo += valor;
        }else{
            System.out.println("Saldo insuficiente para fazer a transferência.");
        }
    }
}

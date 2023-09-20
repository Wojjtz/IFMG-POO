/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import java.util.Random;

/**
 *
 * @author 0057149
 */
public class Conta {

    Random rnd = new Random(); // rnd.nextInt((max - min) + 1) + min;
    public String titular;
    private int numero;
    private double saldo;

    public void getSacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Valor sacado: R$" + valor + "\nSaldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo indiponível. \nSaldo atual: R$ " + this.saldo);
        }
    }

    public void transferir(Cliente destino, double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.getContaBancaria().setSaldo(valor);
        } else {
            System.out.println("Saldo insuficiente para fazer a transferência.");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("Valor depositado: R$" + valor + "\nSaldo atual: R$" + this.saldo);
        }else{
            System.out.println("Impossível inserir valor negativo.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return rnd.nextInt(999);
    }
}

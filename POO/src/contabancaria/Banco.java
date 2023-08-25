/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import java.util.Scanner;

/**
 *
 * @author 0057149
 */
public class Banco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nome do titular: ");
        conta.titular = in.next();
        System.out.println("Número da conta: ");
        conta.numero = in.nextInt();
        System.out.println("Saldo da conta: ");
        conta.saldo = in.nextDouble();     
        
        conta.consultarSaldo();
    }
}

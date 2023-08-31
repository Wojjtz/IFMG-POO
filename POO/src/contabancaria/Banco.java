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
        int op;
        double valor = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Nome do titular: ");
        conta.titular = in.next();
        System.out.println("Número da conta: ");
        conta.numero = in.next();
        System.out.println("Saldo da conta: ");
        conta.saldo = in.nextDouble();     
        
        System.out.println("MENU\n0. Consultar informações \n1. Depositar \n2. Sacar");
        do {
            System.out.print("Opção: ");op = in.nextInt();
            switch (op) {
                case 0:
                    conta.consultarInformacoes();
                    break;
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = in.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = in.nextDouble();
                    conta.sacar(valor);
                    break;
                default:
                    System.out.println("Opção indisponível.");
            }
        } while (op >= 0);
    }
}

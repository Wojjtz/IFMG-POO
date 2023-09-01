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
        Conta conta2 = new Conta();
        
        conta.titular = "Rodolfo";
        conta.numero = "001702";
        conta.saldo = 1000;
        conta2.titular = "Eduardo";
        conta2.numero = "001135";
        conta2.saldo = 1000;
        
        int op, c;
        double valor = 0;
        
        Scanner in = new Scanner(System.in);
        /*
        System.out.println("Nome do titular: ");
        conta.titular = in.next();
        System.out.println("Número da conta: ");
        conta.numero = in.next();
        System.out.println("Saldo da conta: ");
        conta.saldo = in.nextDouble();     
        */
        System.out.println("MENU\n0. Consultar informações \n1. Depositar \n2. Sacar \n3. Transferir \n-1. Sair");
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
                case 3:
                    System.out.println("Conta origem: ");
                    c = in.nextInt();
                    System.out.println("Valor a ser transferido: ");
                    valor = in.nextDouble();
                    if(c == 1){
                        conta.transferir(conta2, valor);
                        conta.consultarInformacoes();
                        conta2.consultarInformacoes();
                    }else{
                        conta2.transferir(conta, valor);
                        conta2.consultarInformacoes();
                        conta.consultarInformacoes();
                    }
                    break;
                default:
                    System.out.println("Opção indisponível.");
            }
        } while (op >= 0);
    }
}

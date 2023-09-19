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
        boolean menuOn;
        double valor;
        Scanner in = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.println("BANCO doCASH \nNome da conta: ");
        cliente.setNome(in.nextLine());
        System.out.println("CPF ('XXX.XXX.XXX-XX'):");
        cliente.setCpf(in.nextLine());
        System.out.println("Endereço: ");
        cliente.setEnd(in.nextLine());
        cliente.criarContaBancaria(cliente.getNome());
        System.out.println("Conta criada com sucesso!");
        
        System.out.println("BANCO doCASH: \n1. Informações da conta \n2. Depositar \n3. Sacar \n4. Transferir \n0. Sair");
        do {
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    cliente.getInformacoes();
                    break;
                case 2:
                    System.out.println("Valor a depositar: ");
                    valor = in.nextDouble();
                    cliente.getContaBancaria().setSaldo(valor);
                    break;
                case 3:
                    System.out.println("Valor a sacar: ");
                    valor = in.nextDouble();
                    cliente.getContaBancaria().getSacar(valor);
                    break;
                case 4:
                    System.out.println("Conta destino: ");
                    Cliente c2 = new Cliente();
                    System.out.println("Valor a transferir: ");
                    valor = in.nextDouble();
                    cliente.getContaBancaria().transferir(c2, valor);
                default:
                    menuOn = false;
            }
        } while (menuOn = true);

    }
}

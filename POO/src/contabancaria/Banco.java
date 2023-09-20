/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 0057149
 */
public class Banco {

    public static void main(String[] args) {
        boolean menuOn;
        int indice = 0, ind = 0;
        double valor;
        Scanner in = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList();

        System.out.println("BANCO doCASH: \n\t1. Criar novo Cliente \n\t2. Informações da conta \n\t3. Depositar \n\t4. Sacar \n\t5. Transferir");
        do {
            System.out.println("\nO que deseja fazer?");
            int opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    clientes.add(new Cliente());
                    inserirNomesCliente(clientes, indice);
                    indice++;
                    break;
                case 2:
                    System.out.println("Informações de qual conta deseja saber?");
                    imprimirClientes(clientes);
                    clientes.get(in.nextInt() - 1).getInformacoes();
                    break;
                case 3:
                    System.out.println("Em qual conta deseja depositar?");
                    imprimirClientes(clientes);
                    ind = in.nextInt();
                    System.out.print("Qual valor a depositar? R$");
                    clientes.get(ind-1).getContaBancaria().setSaldo(in.nextDouble());
                    break;
                case 4:
                    System.out.println("Em qual conta deseja sacar?");
                    imprimirClientes(clientes);
                    ind = in.nextInt();
                    System.out.print("Qual valor a sacar? R$");
                    clientes.get(ind-1).getContaBancaria().getSacar(in.nextDouble());
                    break;
                case 5:
                    System.out.println("Conta origem: ");
                    int clienteOrigem = in.nextInt() - 1;
                    System.out.println("Conta destino: ");
                    int clienteDestino = in.nextInt() - 1;
                    System.out.print("Valor a transferir: R$");
                    clientes.get(clienteOrigem).getContaBancaria().transferir(clientes.get(clienteDestino), in.nextDouble());
                default:
                    menuOn = false;
            }
        } while (menuOn = true);

    }

    static void inserirNomesCliente(ArrayList<Cliente> clientes, int indiceCliente) {
        Scanner in = new Scanner(System.in);
        System.out.println("BANCO doCASH \nNome da conta: ");
        clientes.get(indiceCliente).setNome(in.nextLine());
        System.out.println("CPF:");
        clientes.get(indiceCliente).setCpf(in.nextLine());
        System.out.println("Endereço: ");
        clientes.get(indiceCliente).setEnd(in.nextLine());
        clientes.get(indiceCliente).criarContaBancaria(clientes.get(indiceCliente).getNome());
        System.out.println("Conta criada com sucesso!");
    }
    
    static void imprimirClientes(ArrayList<Cliente> clientes){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i+1) + ". "+ clientes.get(i).getNome());
        }
    }
}

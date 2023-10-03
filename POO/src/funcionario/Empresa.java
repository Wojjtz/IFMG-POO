/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Empresa {
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int indiceFunc = 0;
        boolean out = false;
        ArrayList<Funcionario> funcionarios = new ArrayList();
        
        do {
            System.out.print("[---- MakeUHappy Inc. ----] \n\t1. Cadastrar funcionário \n\t2. Modificar Salário\nR: ");
            switch (in.nextInt()) {
                case 1:
                    cadastrarFuncionario(funcionarios, indiceFunc);
                    break;
                case 2:
                    System.out.println("[--- Modificar Salário ---] \nQual funcionário deseja modificar?");
                    imprimirFuncionarios(funcionarios);
                    System.out.print("R: ");
                    int escolhaFuncionario = in.nextInt();
                    
                    System.out.println("O que deseja modificar? \n\t1. Aumento (+10%)\n\t2. Diminuir (-10%)");
                    int opcao = in.nextInt();
                    if(opcao == 1){
                        funcionarios.get(escolhaFuncionario - 1).aumentarSalario();
                    }else if(opcao == 2){
                        funcionarios.get(escolhaFuncionario - 1).diminuirSalario();
                    }
                    break;
                default:
                    out = true;
            }
        } while (!out);
        
    }
    
    static void cadastrarFuncionario(ArrayList<Funcionario> funcionarios, int indiceFunc){
        funcionarios.add(new Funcionario());
        
        System.out.print("[--- Cadastro de Funcionário ---} "
                + "\nNome: ");
        funcionarios.get(indiceFunc).setNome(in.next());
        System.out.print("Sobrenome: ");
        funcionarios.get(indiceFunc).setSobrenome(in.next());
        System.out.print("Salário inicial: R$");
        funcionarios.get(indiceFunc).setSalarioMensal(in.nextDouble());
        System.out.println("Cadastro realizado com sucesso!\n");
    }
    
    static void imprimirFuncionarios(ArrayList<Funcionario> funcionarios){
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.print((i+1) + ". ");
            funcionarios.get(i).imprimirInformacoes();
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes.funcionario.classes;

/**
 *
 * @author rodol
 */
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Rodolfo","09825945699",5000);
        Gerente g1 = new Gerente("Eduardo", "69785412309",7000,123);
        
        Funcionario f2 = (Funcionario) g1;
        
        if(f2 instanceof Gerente){
            System.out.println(f2.calcularBonificacao());
        }else{
            System.out.println("Erro");
        }
    }
}

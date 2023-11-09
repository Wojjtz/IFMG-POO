/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes.funcionario.classes;

/**
 *
 * @author rodol
 */
public class Gerente extends Funcionario {

    private int senha;
    private int numFuncGerenciados;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numFuncGerenciados = 0;
    }

    public double bonificacao() {
        return (super.calcularBonificacao() + 1000);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean validaSenha(int senha){
        return senha == this.senha;
    }

}

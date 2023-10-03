/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author rodol
 */
public class Funcionario {
    private String nome, sobrenome;
    private double salarioMensal;

    public void imprimirInformacoes(){
        System.out.println("Nome: " + this.nome + " " + this.sobrenome + "\tSalário: R$" + this.salarioMensal);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public void aumentarSalario(){
        this.setSalarioMensal(this.getSalarioMensal() + this.getSalarioMensal() * 0.1);
        System.out.println("Salário atualizado!");
        this.imprimirInformacoes();
    }
    
    public void diminuirSalario(){
        this.setSalarioMensal(this.getSalarioMensal() - (this.getSalarioMensal() * 0.1));
        System.out.println("Salário atualizado!");
        this.imprimirInformacoes();
    }
    
}

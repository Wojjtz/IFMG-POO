/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes.animal.cavalocachorropreguica;

/**
 *
 * @author rodol
 */
public class Cavalo extends Animal{
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    
    public void correr(){
        System.out.println(this.getNome() + " correu!");
    }
}

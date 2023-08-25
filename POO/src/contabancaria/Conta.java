/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author 0057149
 */
public class Conta {
    String titular;
    int numero;
    double saldo;
    
    public double consultarSaldo(){
        System.out.println("Titular: " + titular + "\nNúmero: " + numero + "\nSaldo: " + saldo);
        return 0;
    }
}

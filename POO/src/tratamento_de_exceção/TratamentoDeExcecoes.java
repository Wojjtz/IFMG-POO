/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamento_de_exceção;

/**
 *
 * @author rodol
 */
public class TratamentoDeExcecoes {

    public static void main(String[] args) {
        int[] vet = new int[4];

        try {
            vet[4] = 1;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verifique o tamanho do vetor.");
        }
                System.out.println("XD");

    }
}

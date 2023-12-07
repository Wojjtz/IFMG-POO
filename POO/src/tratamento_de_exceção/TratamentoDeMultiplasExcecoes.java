/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamento_de_exceção;

/**
 *
 * @author rodol
 */
public class TratamentoDeMultiplasExcecoes {

    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128};
        int[] div = {2, 0, 4, 8, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + div[i] + " = " + (num[i] / div[i]));
            } catch (ArithmeticException e) {
                System.out.println("Divisão inválida: / 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Os tamanhos dos vetores são diferentes.");
            }
        }
    }
}

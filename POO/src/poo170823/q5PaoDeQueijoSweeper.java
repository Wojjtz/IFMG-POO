/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo170823;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 0057149
 */
public class q5PaoDeQueijoSweeper {
    public static void main(String[] args) {
        int linha, coluna;
        Scanner in = new Scanner(System.in);
        linha = in.nextInt();
        coluna = in.nextInt();
        int mat[][] = new int[linha][coluna];
        int mat2[][] = new int[linha][coluna];
        
        Random rnd = new Random();
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mat[i][j] = in.nextInt();
                if(mat[i][j] == 1){
                    mat2[i][j] = 9;
                }
            }
        }
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if(mat[i][j] == 0){
                    if(mat[i - 1][j] == 1){
                        mat2[i][j] += 1;
                    }
                    if(mat[i + 1][j] == 1){
                        mat2[i][j] += 1;
                    }
                    if(mat[i][j - 1] == 1){
                        mat2[i][j] += 1;
                    }
                    if(mat[i][j + 1] == 1){
                        mat2[i][j] += 1;
                    }
                }
            }
        }
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println(mat2[i][j]);
            }
            System.out.println();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapplication;

/**
 *
 * @author gabriel
 */
public class JavaApplication {

    public static void main(String[] args) {        
        int height = 10;
        
        for (int row = 0; row < height; row++) {
            for (int space = 0; space < height-row-1; space++) {
                System.out.print(" ");
            }
            
            for (int asterisk = 0; asterisk < row*2+1; asterisk++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }        
        
        int trunkLength = 3;
        
        for (int base = 0; base < trunkLength; base++) {
            for (int space = 0; space < height-2; space++) {
                System.out.print(" ");
            }
            
            for (int trunk = 0; trunk < 3; trunk++) {
                System.out.print("|");
            }
            
            System.out.println("");
        }
    }
}

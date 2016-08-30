/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author gladistone
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 1, 5, 8};
        for (int v:n) {
            System.out.print(v + "");
        }
        System.out.println("");
        int pos = Arrays.binarySearch(n, 5);
        System.out.println("Enconrei na Posição: " + pos);
    }
    
}


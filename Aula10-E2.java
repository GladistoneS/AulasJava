/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author gladistone
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = t.nextInt();
        String tipo;
            switch (perna) {
            case 1: tipo = "saci";
            break;
            case 2: tipo = "Bipide";
            break;
            case 4: tipo = "Quadrupide";
            break;
            case 6 : tipo = "Aranha";
            break;
            default : tipo = "ET";
        }
            System.out.println("Voce è um: " + tipo);
    }
    
}


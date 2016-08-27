/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaifelse;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author gladistone
 */
public class ProgramaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c = Calendar.getInstance();
        int anoatual = c.get(Calendar.YEAR);
        Scanner t = new Scanner(System.in);
        System.out.print("Ano de Nascimento:");
        int ano = t.nextInt();
        int idade = anoatual - ano;
        System.out.println("Sua Idade é:" + idade);
        if (idade >= 18) {
            System.out.println("E você é Maior");
        }
        else {
            System.out.println("E você é Menor");
        }
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scuola;

import java.util.Scanner;

/**
 *
 * @author Nicola
 */
//

public class Conteggio01 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int n;
        System.out.println("n: ");
        n = input.nextInt();
        if(n<0){
            System.out.println("n e' negativo");
        }
        else{
            for (int cont=0; cont<=n; cont++){
                System.out.print(cont+" ");
            }
        }   
    }
}

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
//Far inserire una serie numerica di interi fermandosi quando viene inserito due volte consecutive lo stesso numero e visualizzarlo.

public class NumeriRipetuti01 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num1, num2;
        num1=0;
        do{
            num2=num1;
            System.out.println("num: ");
            num1 = input.nextInt();
        }while(num1!=num2);
        System.out.println("hai inserito due volte: "+num2);
    }
}

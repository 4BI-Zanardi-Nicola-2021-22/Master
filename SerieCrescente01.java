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
//  Leggere una serie di numeri interi passati dall’utente, fermandosi al primo numero che rende la serie non crescente e        restituendo quanti numeri erano stati inseriti.

public class SerieCrescente01 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num1, cont, num2;
        cont=0;
        num1=0;
        do{
            num2=num1;
            System.out.println("num: ");
            num1 = input.nextInt();
            if(num1>num2){
                cont++;
            }
        }while(num1>num2);
        System.out.println("numeri inseriti:" +cont--);
    }
}

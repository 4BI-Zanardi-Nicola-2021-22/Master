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
//Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire un numero maggiore o uguale a zero e stampa il messaggio sto ciclando un numero di volte pari al numero inserito dall’utente. Se il valore inserito dall’utente `e negativo il programma stampa un messaggio di errore.

public class ScrivoScrivoScrivo01 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int num;
        System.out.println("num maggiore o uguale a 0: ");
        num = input.nextInt();
        if (num<0){
            System.out.println("numero negativo");
        }
        else{
            for(int cont=1; cont<=num; cont++){
                System.out.print(" sto ciclando;");
            }
        }
    }
}

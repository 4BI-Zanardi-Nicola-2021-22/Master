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
// Dato un numero intero che rappresenta un numero di ammalati e un numero reale che rappresenta la percentuale di ammalati che ogni giorno guarisce, calcolare quanti giorni sono necessari affinché il numero di ammalati sia minore di 100.

public class PopolazioneAmmalta02 {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
        int giorni, ammalati;
        double percentuale, guariti;
        giorni=0;
        System.out.println("\nNumero Ammalati :");
        ammalati = sc.nextInt();
        System.out.println("\nPercentuale ammalati guariti :");
        percentuale = sc.nextInt();
        if (ammalati<100) {
            System.out.println("Servono zero giorni");
        }
        else {
            while(ammalati>100){
                guariti=(ammalati*percentuale)/100;
                ammalati=(int) (ammalati-guariti);
                giorni=giorni+1;
            }
            System.out.println("Servono giorni :"+giorni);
        }
    }
}


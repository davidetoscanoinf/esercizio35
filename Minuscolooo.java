/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toscano35;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Minuscolooo {
    static final int TANTI = 30 ;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String parola;   //stringa come oggetto
        char[] minuscolo = new char[TANTI];   //stringa come array
        System.out.print("\nInserisci una parola : ");
        parola = in.next();            // legge una stringa
        // trasforma la stringa letta in un array di caratteri 
        for (int x= 0 ; x< parola.length(); x++){
            minuscolo[x] = parola.charAt(x); // primo carattere letto 
            
        }
        for( int x = 0 ; x < parola.length(); x++){
            minuscolo[x]= Character.toLowerCase(minuscolo[x]); //in minuscolo 
            
        }
        System.out.println("la parola in minuscolo (array) : ");
        for(int x =0 ; x < minuscolo.length ; x++){
            System.out.print(minuscolo[x]);
        }
        //trasformo l'array di caratteri a stringa 
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto) : ");
        System.out.println(parolaMinu);
    }
    
}


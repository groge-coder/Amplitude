/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amplitude;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Amplitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NL=5,NC=2;
        int i,j,min,max,amp;

        //déclaration du tableau
        int [][] tableau;

        // création du tableauleau
        tableau = new int [NL][NC];
        Scanner reader = new Scanner(System.in);
        
        //remplissage du tableau
        for (i = 0;i< NL-1;i++) {
            for (j = 0;j< NC-1;j++) {
                System.out.print("Entrez une valeur :");
                tableau[i][j]=reader.nextInt();
            }    
        }
               
        min=tableau[0][0];
        max=tableau[0][0];
        //recherche de l'amplitude
        for (i = 0;i< NL-1;i++) 
            for (j = 0;j< NC-1;j++) {
                if (tableau[i][j] == min) 
                    min= tableau[i][j];
                    else {
                    max= tableau[i][j];
            }   
            }
        amp=max-min;
        //affichage du tableau
        for (i = 0;i< NL-1;i++)
            for (j = 0;j< NC-1;j++) {
                System.out.print(tableau[i][j]+min+max);
            }
        System.out.print("l'amplitude est :"+amp);   
        
        
        
        }
}
    
    

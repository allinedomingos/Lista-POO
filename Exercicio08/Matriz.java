
package Exercicio08;

import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class Matriz {
   
    static int matriz_id[][] = new int[10][10];
    
    public static void constroi_matriz(){
        
        for (int i=0;i<10;i++){
	     Matriz.matriz_id[i][i] = 1;
	}		
}
    public static void mostra_matriz(){
        
        for (int i=0;i<10;i++){
	    for (int j=0;j<10;j++){
	         System.out.print(matriz_id[i][j]);				
	    
        }
             System.out.println();
    }
}        
    public static void main(String[] args) {

        System.out.println ("Construindo um matriz ... ");
        constroi_matriz();
        mostra_matriz();
    }
}

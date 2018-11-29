package Exercicio07;

import java.util.Random;

/**
 *
 * @author Alline
 */
public class OrdenaBolha {
    
    static int[] n = new int[10];
    
    public static int rand() {

        Random gerador = new Random();
        int numero = gerador.nextInt(100);

        return numero;
    }

    public static void constroi() {
      
        for (int i = 0; i < 10; i++) {
            int sorteia = rand();
            n[i] = sorteia;
            System.out.print(" " + n[i]);
        }
        
    }
    public static void depois(){
        
              System.out.println("O vetor ordenado >>>>  ");
           
	      for (int i=0;i<10;i++){
                    System.out.print(" " + n[i]);
		
              }
               System.out.println();
    }
    public static void ordena() {

        for (int i = n.length; i > 0; i--) {
            for (int j = 1; j < n.length; j++) {
                if (n[j - 1] > n[j]) {
                    int aux = n[j - 1];
                    n[j - 1] = n[j];
                    n[j] = aux;
                   
                }
            }

        }
           System.out.println();
           System.out.println("-----------");
    }   
    
    public static void main(String[] args) {

        System.out.println ("Construindo um vetor ... ");
        
        constroi();
        ordena();
        depois();

        }
    }


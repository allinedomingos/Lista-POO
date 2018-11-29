
package Exercicio06;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class JogoAzar {
    
     public static String Ler_teclado (){
        Scanner  entrada = new  Scanner(System.in);
        return entrada.nextLine();
    }
    
     public static int Rand(){
        
        Random gerador = new Random();
        int numero = gerador.nextInt(100);
       
        return numero;
    }
     public static int Entrada(){
        
        System.out.println("Digite um numero:");
        int numero = Integer.valueOf(Ler_teclado());
         System.out.println("------------"); 
        return numero;
     }
     
     public static String Compara(int numero, int gerado){
        
        
        while(numero != gerado) {
          
          numero = Entrada();
          if(numero > gerado) {
              System.out.println("O numero correto é menor que " + numero);
             } else if(numero < gerado){
              System.out.println("O numero correto é maior que " + numero);
                } else { 
                System.out.println("Parabéns você acertou!!");
            }
            
         }
         
         System.out.println();  
         return ("0 numero " + numero + " é o correto" );
         
     }
     
     public static void main(String[] args) {
        
        String resultado;
        int numero = 0;
        int rand;
        
       
        rand = Rand();
        
        resultado = Compara(numero,rand);
        System.out.println("----------"); 
        System.out.println(resultado);
          
         
     }
     
}

   


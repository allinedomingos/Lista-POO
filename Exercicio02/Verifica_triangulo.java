
package Exercicio02;

import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class Verifica_triangulo {
  
    public static String ler_teclado (){
        Scanner  entrada = new  Scanner(System.in);
        return entrada.nextLine();
        
    }
    public static void Verifica(int a, int b, int c){
        
        if(a == b && b == c ){
         System.out.println("Este é um triangulo equilatero");
                } else if( a == b || b == c || a == c) {
                    System.out.println("Este é um triangulo isósceles");
                    } else {
                       System.out.println("Este é um triangulo escaleno");
                }
        }
    public static void main(String[] args) {
     
        
      
      System.out.println("Digite um valor para lado A:"); 
      int a = Integer.parseInt(ler_teclado());
      System.out.println();
      
      System.out.println("Digite um valor para lado B:");
      int b = Integer.parseInt(ler_teclado());
      System.out.println();
      
      System.out.println("Digite um valor para lado C:");
      int c = Integer.parseInt(ler_teclado());
      System.out.println();
    
     
      Verifica(a,b,c);
          
    }

    

}


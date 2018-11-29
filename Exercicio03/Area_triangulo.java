
package Exercicio03;

import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class Area_triangulo {
    
    public static void Area (int b, int h ){
        
        int resultado;
        resultado = (b*h)/2;
        System.out.println("A area do triangulo é >>>> "  +  resultado);
    }
     public static String ler_teclado (){
      
        Scanner  entrada = new  Scanner(System.in);
        return entrada.nextLine();
        
    }
    
    public static void main( String arg[]){
        
        System.out.println("Digite o valor da base da triangulo:");
        int base = Integer.parseInt(ler_teclado());
        
        System.out.println("----------");
        
        System.out.println("Digite o valor da altura do triangulo:");
        int altura = Integer.parseInt(ler_teclado());
    
        
        Area(base,altura);
    }
    
    
}

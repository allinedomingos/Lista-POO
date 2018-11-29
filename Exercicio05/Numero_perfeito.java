
package Exercicio05;
// 6, 28, 46 exemplo de numeros

import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class Numero_perfeito {
    
 public static String Ler_teclado (){
        Scanner  entrada = new  Scanner(System.in);
        return entrada.nextLine();
 }
 public static String Verifica(int numero){
        
        int valor = 0;
        
        for (int i=1 ;i<numero;i++){
            if (numero % i== 0){
            valor = i + valor;
        }
      }
        if ( valor== numero){
       return (numero  + " é número perfeito!!");
        } else {
       return (numero + " não é número perfeito!!");        
        }
        
    }
  public static void main(String[] args) {
        
          System.out.println("Digite um número:");
          int numero = Integer.valueOf(Ler_teclado());
          String resultado;
           
          System.out.println("------------");
          resultado = Verifica(numero);
          
          System.out.println(resultado);
          
      
    }
}


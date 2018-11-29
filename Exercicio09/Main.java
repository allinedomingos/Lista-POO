
package Exercicio09;

import java.util.Scanner;

/**
 *
 * @author Alline
 */
public class Main {
    
    public static String ler_teclado (){
        Scanner  entrada = new  Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static void main(String[] args) {
    
        double raio, resultado;
		Matematica math = new Matematica();
		
                System.out.println("Digite um valor para raio do circulo:");
                raio = Double.valueOf(ler_teclado());
		System.out.println("-----------------");
                
                
		resultado = math.calculo_diametro(raio);
		System.out.println("O diametro do circulo >>>>  " +  resultado);
		resultado = math.calculo_circunferencia(raio);
		System.out.println("A circuferencia do circulo >>>> " +  resultado);
		resultado = math.area(raio);  
		System.out.println("A área do circulo >>>> " +  resultado);
		

	}

}

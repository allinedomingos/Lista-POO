
package Exercicio10;

/**
 *
 * @author Alline
 */
public class MatematicaStatic {
   
 
    static double pi = 3.14;
   
    
    public static double calculo_diametro(double raio){
       
                double diametro = raio * 2;;
		return diametro;
    }
    
    public static double calculo_circunferencia(double raio){
		
		double circunferencia = 2 * MatematicaStatic.pi * raio;
		return circunferencia;
        
        
    }
    
    public static double area(double raio){
                
		double r = 2 * raio;
		double area = MatematicaStatic.pi * r;
		return area;
    }
   
}

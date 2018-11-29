
package Exercicio09;

/**
 *
 * @author Alline
 */
public class Matematica {

  
    public double calculo_diametro(double raio){
       
                double diametro =  raio * 2;
		return diametro;
    }
    
    public double calculo_circunferencia(double raio){
        
                double pi = 3.14;
		
		double circunferencia = 2 * pi * raio;
		return circunferencia;
        
        
    }
    
    public double area(double raio){
                double pi = 3.14;
		
		double r = 2 * raio;
		double area = pi * r;
		return area;
    }
}

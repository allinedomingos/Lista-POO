
package Exercicio04;

/**
 *
 * @author Alline
 */
class Fibonacci {
    private int n;
    
    public static int funcao(int n){
        if(n < 2 ) return n;
        else return funcao(n - 1) + funcao(n - 2);
    } 
    public static void main(String arg[]){
     
        Fibonacci fibo = new Fibonacci();
        
        System.out.println("A série fibonacci de 20 termos é >>>>>");
        System.out.println();
        
        for(int i=0;i<20;i++){
             System.out.print(fibo.funcao(i) + " ");
        }
        
    }
}

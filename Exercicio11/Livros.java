
package Exercicio11;

/**
 *
 * @author Alline
 */
public class Livros {
    
    private String titulo;
    private String autor;
    private int ano;
    private String editora;
    private boolean emprestado;
	
	
   public Livros(String titulo,String autor,int ano,String editora){
	this.titulo = titulo;
	this.autor = autor;
	this.ano = ano;
	this.editora = editora;
					
    }
	
    public void mostrarTitulo (){
	System.out.println("Título : " + this.titulo);
				
    }		
    public void emprestar(){
	emprestado = true;
		
    }
    public void devolver(){
	emprestado = false;
		
    }
    public void verificaLivro(){
	if (this.emprestado == true){
			 System.out.println("Disponibilidade : emprestado");
		} else {
			 System.out.println("Disponibilidade : disponível");
		}
		
    }
	
    public void mostrarTudo (){
		System.out.println("Título : " + this.titulo);
		System.out.println("Autor : " + this.autor);
		System.out.println("Ano : " + this.ano);
		System.out.println("Editora : " + this.editora);
		System.out.println("Título : " + this.titulo);
		verificaLivro();
		System.out.println();
		
		
		 
	}
 
}


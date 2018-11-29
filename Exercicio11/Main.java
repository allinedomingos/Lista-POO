
package Exercicio11;

/**
 *
 * @author Alline
 */
public class Main {
 
      public static void main(String[] args) {
		
               String str1 = "Programando em java";
          
		Livros livro1 = new Livros("Programando em java", "ASD", 2016, "IFSC");
		Livros livro2 = new Livros("Programando em C++", "GW", 2014, "IFSC-SJ");
		Livros livro3 = new Livros("Programação em python", "WA", 2015, "IFSC-SJ/SC");
		Livros livro4 = new Livros("PO", "HJ", 2011, "IFSC");
		Livros livro5 = new Livros("Orientado Objeto", "HF", 2009, "IFSC-SJ");
		
		
				
		System.out.println("Os titulos dos livros existentes são: \n");
		livro1.mostrarTitulo();
		livro2.mostrarTitulo();
		livro3.mostrarTitulo();
		livro4.mostrarTitulo();
		livro5.mostrarTitulo();
		System.out.println();
		
		
		livro1.emprestar();
		livro2.devolver();
		livro3.emprestar();
		livro4.devolver();
		livro5.emprestar();
		
		
		System.out.println("Essas são os livros e suas caracteristicas existentes: ");
		livro1.mostrarTudo();
		livro2.mostrarTudo();
		livro3.mostrarTudo();
		livro4.mostrarTudo();
		livro5.mostrarTudo();
		System.out.println();
	
		
		
		
		
	}

}

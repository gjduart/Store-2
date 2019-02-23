
public class Livro extends Produto {
  
	private String autor;
	private String editora;
	private String genero;
	private int numeropag;
		
		
	Livro(String nome, String codigo, double preco , String autor, String editora
			, String genero , int numeropag) {
		super(nome, codigo, preco);
	    this.autor = autor;
	    this.editora = editora;
	    this.genero = genero;
	    this.numeropag = numeropag;
	}
	
 public String toString() {
	return super.toString() +
			"\nLivros" +
			"\nAutor:" + autor +
			"\nEditora:" + editora + 
			"\nNumero de Paginas:" + numeropag +
			"\nGenero:" + genero 
			
			;
	 
 }
	
}


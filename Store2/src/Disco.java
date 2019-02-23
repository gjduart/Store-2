
public class Disco extends Produto {

  private String banda;

private String estilo;
  private int numerofaixas;
	
	
	Disco(String nome, String codigo, double preco,String banda, String estilo,int numerofaixas) {
		super(nome, codigo, preco);
	    this.banda = banda;
	    this.estilo = estilo;
	    this.numerofaixas = numerofaixas;
	}
			
	 public String toString() {
			return super.toString() +
					"\nBanda:" + banda +
					"\nEstilo:" + estilo + 
					"\nNumero de faixas" + numerofaixas 
				
					;
			 
		 }
}

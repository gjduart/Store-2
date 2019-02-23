
public class Produto {
 
		private String nome;
 

		private String codigo;
        private double preco;
        
        
      Produto(String nome , String codigo, double preco){
    	  this.nome = nome;
    	  this.codigo = codigo;
    	  this.preco = preco;
      }
        
  
        
public String toString() {
	return "\n============================="
			+ "\nNome:" + nome +
           "\nCodigo:" + codigo + 
           "\nPreco:" + preco + "R$";
	 
} 
        
public boolean equals(Object o) {
	 if (o instanceof Produto) {
	      Produto p = (Produto) o;
	      return this.nome.equals(p.getNome()) && this.codigo.equals(p.getCodigo());
	    }else {
	      return false;
	    }
}



public void setCodigo(String codigo) {
	this.codigo = codigo;
}



public String getCodigo() {
	return codigo;
}
        
public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

       
        
        
        
        
        
        
        
        
        
             

        
}

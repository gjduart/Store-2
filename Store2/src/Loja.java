import java.util.ArrayList;
public class Loja {
	ArrayList< Produto > Produtos = new ArrayList< Produto >();
	


public void cadastrarProduto(Produto p ){
if(Produtos.isEmpty()) {
	Produtos.add(p);
}
	boolean l = p.equals(Produtos.get(Produtos.size()-1));
		if(l) 
		{		
			if(Produtos.size()-1 !=0) System.out.println("Produto ja Cadastrado");
	    
		}else {
			
			Produtos.add(p);
			
		}
}


public void listarProdutos() {

 System.out.println(Produtos.toString());
 		
}
public void listarLivros() {
	for (int i =0 ; i<Produtos.size() ; i++) {	
		   if (Produtos.get(i).getClass().getName() == "Livro") {
			  System.out.println(Produtos.get(i).toString());
		  
		   }
		
					
			
		}


}

public void listarDiscos() {
for (int i =0 ; i<Produtos.size() ; i++) {	
   if (Produtos.get(i).getClass().getName() == "Disco") {
	  System.out.println(Produtos.get(i).toString());
  
   }
	
	
	
	
}
	
}
}
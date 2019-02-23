
public class Teste {

	public static void main(String[] args) {
		Produto p = new Produto("escova","111",1.99);
		Produto q = new Produto("pente","222",4.99) ;
		Produto r = new Produto("vassoura","333",9.95);
		
		Livro g = new Livro("Cavaleiro dos 7 reinos","444",15.99,"George R.R. Martin","Leya","Fantasia",350);
		Livro d = new Livro("Senhor dos Aneis","555",49.99,"J.R.R TOLKIEN","WMF","Fantasia",350);
		Livro f = new Livro("Senhor dos Aneis","555",5.99,"George R.R. Martin","WMF","Fantasia",650);
		
		
		Disco z,x,c;
		z = new Disco("Led Zeppelin IV","777",41.99,"Led Zeppelin","Rock",8);
		x = new Disco("The Darkside of moon","888",31.99,"Pink Floyd","Rock Progressivo",10);
		c = new Disco("Riding with the king","999",21.99,"B.B.King", "Blues",7);
		
		Loja l = new Loja();
		//Produto qualquer
		l.cadastrarProduto(p);
		l.cadastrarProduto(q);
		l.cadastrarProduto(r);
		
		//Livros
		l.cadastrarProduto(g);
		l.cadastrarProduto(d);
		l.cadastrarProduto(f);
		
		
		
		//Discos
		l.cadastrarProduto(z);
		l.cadastrarProduto(x);
		l.cadastrarProduto(c);
	
		l.listarLivros();
		
		
	}

}

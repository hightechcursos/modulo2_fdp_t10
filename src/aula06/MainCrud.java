package aula06;

public class MainCrud {

	public static void main(String[] args) {
	
		ProdutoCRUD prodCrud =  new ProdutoCRUD();
		
		Produto livro = new Produto();
		Produto celular = new Produto();
		
		prodCrud.cadastrar(livro);
		prodCrud.cadastrar(celular);
		
		prodCrud.excluir(livro);
		prodCrud.alterar(celular);
		
		ClienteCRUD cliCrud = new ClienteCRUD();
		Cliente jao =  new Cliente();
		Cliente maria = new Cliente();
		
		cliCrud.cadastrar(jao);
		cliCrud.cadastrar(maria);
		cliCrud.excluir(jao);
		cliCrud.alterar(maria);
		
	}

}

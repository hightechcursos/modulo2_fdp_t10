package aula06;

import java.util.ArrayList;
import java.util.List;

public class ClienteCRUD implements CRUD<Cliente>{

	List<Cliente> clientes = new ArrayList<>();
	
	@Override
	public void cadastrar(Cliente o) {

			clientes.add(o);
	}

	@Override
	public void alterar(Cliente o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente[] buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}

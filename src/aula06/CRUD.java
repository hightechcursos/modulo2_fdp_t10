package aula06;

public interface CRUD<T> {
	public void cadastrar(T o);
	public void alterar(T o);
	public void excluir(T o);
	public T[] buscarTodos();
	
}

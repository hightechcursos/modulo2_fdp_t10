package aula01;

public class Cidade {

	private String nome;
	private Estado estado;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	@Override
	public String toString() {
		return nome + " ";
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}

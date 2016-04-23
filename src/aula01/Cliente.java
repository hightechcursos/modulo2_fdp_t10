package aula01;

public class Cliente {
	private String nome;
	private Cidade cidade;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setCidade(Cidade cidade){
		this.cidade = cidade;
	}
	
	public Cidade getCidade(){
		return cidade;
	}
	
}

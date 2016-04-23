package aula02;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Estado estado = new Estado();
		estado.setNome("Mato grossso do Sul");
		estado.setUf("MS");
		

		Cidade cidade = new Cidade();
		cidade.setNome("Campo Grande");
		cidade.setEstado(estado );
		
		
		ClientePF clipf1 =  new ClientePF();
		clipf1.setNome("Jão");
		clipf1.setCpf("9090");
		clipf1.setRg("9878787");
		clipf1.setCidade(cidade );
		
		
		
		
		
	}

}

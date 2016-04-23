package aula01;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		
		Estado est =  new Estado();
		est.setNome("Mato Grosso do Sul");
		est.setUf("MS");
		
		Cidade cid = new Cidade();
		cid.setNome("Campo Grande");
		cid.setEstado(est);
		
		Cliente cli = new Cliente();
		cli.setNome("Jão");
		cli.setCidade(cid);
		
		System.out.println(cli.getCidade());
	}
}

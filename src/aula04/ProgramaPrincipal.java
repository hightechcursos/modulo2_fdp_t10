package aula04;

import aula02.Pessoa;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println();
		
		ValidacaoUtil.validarCNPJ("99999");
		
		Computador c1 = new Computador("Accer",8);
		Computador c2 = new Computador("Accer", 8);
		
		/*System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		*/
		Pessoa p1 = new Pessoa();
		p1.setNome("Jão");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jão");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		/* new Computador("Dell", 4);
		
		System.out.println(new Computador().getQtd());*/
	}

}

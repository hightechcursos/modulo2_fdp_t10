package aula06;

public class Main {

	public static void main(String[] args) {

		Veiculo rolema = new CarrinhoRolema();
		rolema.acelerar();
		rolema.frear();

		Veiculo passeio = new CarroPasseio();
		passeio.acelerar();
		passeio.frear();

		Pessoa jao = new Pessoa();
		jao.veiculo = rolema;

		Pessoa maria = new Pessoa();
		maria.veiculo = passeio;

		if (maria.veiculo instanceof Automovel) {
			((Automovel) maria.veiculo).ano = 2000;
		}
		//Classe interna
		class VeiculoInterna implements Veiculo {
			public void acelerar() {
				System.out.println("Interno acelerando...");
			}

			public void frear() {
				System.out.println("Interno frear...");
			}
		}
		
		Veiculo veiculoInterno =  new VeiculoInterna() ;
		veiculoInterno.acelerar();
		veiculoInterno.frear();
		
		//Criando classe Anonima e já instanciando objeto
		Veiculo anonimo = new Veiculo() {

			@Override
			public void frear() {
				System.out.println("Anonimo acelerando...");
			}
			@Override
			public void acelerar() {
				System.out.println("Anonimo freando...");

			}
		};

		anonimo.acelerar();
		anonimo.frear();
	}
}

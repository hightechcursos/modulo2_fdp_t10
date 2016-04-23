package aula03;

public class Pintor extends Funcionario {

	public double calcularSalario(){
		double novoSal = ( salario * 0.1 )   + salario;
		return novoSal;
	}
}

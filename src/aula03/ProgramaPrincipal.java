package aula03;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Mecanico mecanico =  new Mecanico();
		mecanico.setSalario(1000);
		
		Pintor pintor =  new Pintor();
		pintor.setSalario(1000);
		
		
		Funcionario funcs[] = new Funcionario[2];
		
		funcs[0] = mecanico;
		funcs[1] = pintor;
		/*for (int i = 0; i < funcs.length; i++) {
			double sal ;
			if (funcs[i] instanceof Pintor){
				sal = ((Pintor)funcs[i]).calcularSalarioPintor();
			}else {
				sal = funcs[i].calcularSalario();
			}
			System.out.println(sal);
			
		}*/
		
		for (int i = 0; i < funcs.length; i++) {
			double sal =  funcs[i].calcularSalario();
			System.out.println(sal);
		}
		
		
	}

}

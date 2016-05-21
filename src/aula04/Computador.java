package aula04;

public class Computador {

	private static int qtd =0;
	private String marca;
	private double memoria;
	//private double valor;
	
	public Computador() {
		qtd++;
	}
	
	public Computador(String marca, double memoria){
		this();
		this.marca =marca;
		this.memoria= memoria;
	}
	
	
	public boolean equals(Object obj) {
		
		if( obj instanceof Computador){
			
			Computador comp = (Computador) obj ;
		
			if (! this.marca.equals(comp.getMarca()) 
					|| this.memoria!=comp.getMemoria()  ) {
				return false;
			}
				
		} else {
			return false;
		}
		
		return true;
	}
	
	
	@Override
	public int hashCode() {
		
		int n = marca.length() + (int)memoria;

		return n;
	}
	
	public static int getQtd(){
		return qtd;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	
	
}

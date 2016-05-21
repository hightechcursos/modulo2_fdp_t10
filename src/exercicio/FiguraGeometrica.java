package exercicio;

public abstract class FiguraGeometrica {

	private String cor;
	
	public  abstract double calcularArea();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}

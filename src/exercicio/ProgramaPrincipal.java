package exercicio;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Geometria geo = new Geometria();
		
		Retangulo ret =  new Retangulo();
		ret.setBase(10.0);
		ret.setAltura(2);
		ret.calcularArea();
		ret.setCor("Amarelo");
		
		Circulo  circ = new Circulo();
		circ.setRaio(3.0);
		circ.calcularArea();
		circ.setCor("Verde");
		
		Triangulo tri = new Triangulo();
		tri.setBase(2.0);
		tri.setAltura(3.0);
		tri.calcularArea();
		tri.setCor("Azul");
		
		

		//???
		geo.add(ret);
		geo.add(circ);
		geo.add(tri); 
		
		FiguraGeometrica[] figurasGeo = geo.getFigurasComArea();
		
		for(int i=0; i<figurasGeo.length; i++){
			System.out.println(figurasGeo[i].calcularArea());
		}
		
		
		
		
		
		
	}
}

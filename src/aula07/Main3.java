package aula07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {

		
			Map<Integer, Cliente> clientes =  new HashMap<>();
			
			clientes.put(100, new Cliente("Jao"));
			clientes.put(101, new Cliente("Zé"));
			clientes.put(102, new Cliente("Maria"));
			
			Set<Integer>  keys = clientes.keySet();
			
			for(Integer k : keys){
				Cliente c = clientes.get(k);
				System.out.println(c.getNome());
			}
			
			
			
	}
}

package aula07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>(); 
		clientes.add(new Cliente("Jão"));
		clientes.add(new Cliente("Zé"));
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Maria"));
		
		System.out.println("----Indice------");
		for (int i=0; i<clientes.size(); i=i+2){
			Cliente clienteAcessado = clientes.get(i);
			System.out.println(clienteAcessado.getNome());
		}
		System.out.println("----Iterator-------");
		Iterator<Cliente>  it = clientes.iterator();
		
		while(it.hasNext()){
			Cliente clienteAcessado = it.next();
			System.out.println(clienteAcessado.getNome());
			
		}
		System.out.println("-----For Each------");
		for (Cliente clienteAcessado : clientes){
			System.out.println(clienteAcessado.getNome());
		}
	
		//Cliente clienteRemovido = clientes.remove(0);
		
		
		
		 
	}
}

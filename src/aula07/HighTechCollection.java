package aula07;

import java.util.Collection;
import java.util.Iterator;

import aula01.Cliente;

public class HighTechCollection<E> implements Collection<E>{

	E vetor[] ;
	
	@Override
	public int size() {
		
		return vetor.length;
	}

	@Override
	public boolean isEmpty() {
		
		if (vetor==null) return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(o)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}

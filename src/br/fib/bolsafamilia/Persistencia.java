package br.fib.bolsafamilia;

public interface Persistencia<T> {
	
	public boolean create(T t);
	
	public T read(String nome);
	
	public boolean update(T t);
	
	public boolean delete(T t);
}

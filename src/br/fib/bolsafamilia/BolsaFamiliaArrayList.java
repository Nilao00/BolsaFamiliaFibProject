package br.fib.bolsafamilia;

import java.util.ArrayList;
import java.util.List;

public class BolsaFamiliaArrayList 
	implements Persistencia<BolsaFamilia>{
	
	List<BolsaFamilia> bolsasFamilias = new ArrayList<>();


	@Override
	public boolean create(BolsaFamilia t) {
		return bolsasFamilias.add(t);
	}

	@Override
	public BolsaFamilia read(String cpf) {
		int index = bolsasFamilias.indexOf(new BolsaFamilia(cpf));
		if(index > 0) {
			return bolsasFamilias.get(index);
		}
		return null;
	}

	@Override
	public boolean update(BolsaFamilia t) {
		int index = bolsasFamilias.indexOf(t);
		if(index > 0) {
			bolsasFamilias.set(index, t);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(BolsaFamilia t) {
		return bolsasFamilias.remove(t);
	}
}

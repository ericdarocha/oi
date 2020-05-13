package modelo.basededados;
import java.util.List;
import java.util.Map;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;


public class BDPessoaJuridica extends BaseDeDados {
	
	private Map<PessoaFisica, List<PessoaJuridica>> cadastroPJ;

	@Override
	protected List<Pessoa> buscar(Pessoa p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void adicionar(Pessoa nova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remover(Pessoa velha) {
		// TODO Auto-generated method stub
		
	}
	
}

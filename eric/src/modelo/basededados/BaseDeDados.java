package modelo.basededados;

import java.util.ArrayList;


import modelo.Pessoa;


public abstract class BaseDeDados {
	
	ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	
	protected abstract void adicionar(Pessoa nova);
	protected abstract void remover(Pessoa velha);
	protected void atualizar (Pessoa nova) {
		remover(nova);
		adicionar(nova);
	}
}

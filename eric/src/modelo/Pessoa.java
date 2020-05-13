package modelo;
import java.util.ArrayList;

public abstract class Pessoa {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	public Pessoa (String nome, Endereco endereco, Telefone telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	protected abstract Documento getDocumento();

	abstract public void setDocumento(Documento documento);
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Pessoa)) return false;
		
		Pessoa tmp = (Pessoa) obj;
		
		if(this.getDocumento().equals(tmp.getDocumento())) return true;
		
		return false;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
	


}

package modelo;

public class PessoaFisica extends Pessoa {
	
	private CPF cpf;
	
	public PessoaFisica(String umNome, CPF umDocumento, Endereco umEndereco, Telefone umTelefone) {
		setNome(umNome);
		setDocumento(umDocumento);
		setEndereco(umEndereco);
		setTelefone(umTelefone);
	}
	
	
	
	protected Documento getDocumento() {
		
		return this.cpf;
	}

	public void setDocumento(Documento documento) {
	
		this.cpf = (CPF) documento;

	}

}

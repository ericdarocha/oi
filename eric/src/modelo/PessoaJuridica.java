package modelo;

public class PessoaJuridica extends Pessoa {
	private PessoaFisica responsavel;
	private CNPJ cnpj;
	
	public Documento getDocumento() {
		
		return this.cnpj;
	}
	public void setDocumento (Documento documento) {
		this.cnpj = (CNPJ) documento;
	}
	public PessoaFisica getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}

}

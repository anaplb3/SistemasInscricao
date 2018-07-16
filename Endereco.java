
public class Endereco {
	private String logradouro;
	private String numero;
	private String cidade;
	private String estado;
	
	
	Endereco(String logradouro, String numero, String cidade, String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getlogradouro() {
		return this.logradouro;
	}
	
	public void setlogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getnumero() {
		return this.numero;
	}
	
	public void setnumero(String numero) {
		this.numero = numero;
	}
	
	public String getcidade() {
		return this.cidade;
	}
	
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getestado() {
		return this.estado;
	}
	
	public void setestado(String estado) {
		this.estado = estado;
	}
}

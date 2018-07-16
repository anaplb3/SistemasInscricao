
public class Participante {
	private String nome;
	private String email;
	private String instituicao;
	private Endereco endereco;
	
	Participante(String nome, String email, String instituicao, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.instituicao = instituicao;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return "Nome do participante: "+this.nome+"\n Email: "+this.email+"\n Institui��o: "+this.instituicao+"\n Endere�o: "+this.endereco;
	}

}

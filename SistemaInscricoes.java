import java.util.ArrayList;

public class SistemaInscricoes {
		private ArrayList<Participante> participante;
		
		
		SistemaInscricoes(ArrayList<Participante> participante) {
			this.participante = new ArrayList<Participante>();
		}
		
		SistemaInscricoes() {
			this.participante = null;
		}
		
		public void mostraParticipante() {
			for(Participante p: this.participante) {
				System.out.println(p.getNome());
				System.out.println(p.getEmail());
				System.out.println(p.getInstituicao());
				System.out.println(p.getEndereco().getlogradouro());
				System.out.println(p.getEndereco().getnumero());
				System.out.println(p.getEndereco().getcidade());
				System.out.println(p.getEndereco().getestado());
			}
		}
		
		public void cadastraParticipante(String nome, String email, String instituicao, String logradouro, String numero, String cidade, String estado) {
			Endereco e = new Endereco(logradouro, numero, cidade, estado);
			Participante p = new Participante(nome, email, instituicao, e);
			this.participante.add(p);
		}
		
		public void removeParticipante(String email) {
			for(Participante p: this.participante) {
				if(p.getEmail().equals(email)) {
					this.participante.remove(p);
				}
			}
		}
		
		public ArrayList<String> pesquisaParticipantesDaInstituicao(String inst) {
			ArrayList<String> pessoasInst = new ArrayList<String>();
			for(Participante p: this.participante) {
				if(p.getInstituicao().equals(inst)) {
					pessoasInst.add(p.getNome());
				}
			}
			return pessoasInst;
		}
		
		public ArrayList<String> pesquisaParticipantesDoEstado(String estado) {
			ArrayList<String> pessoasEstado = new ArrayList<String>();
			for(Participante p: this.participante) {
				if(p.getEndereco().getestado().equals(estado)) {
					pessoasEstado.add(p.getNome());
				}
			}
			return pessoasEstado;
		}
		
		public String pesquisaParticipante(String email) {
			String results = "Não encontrado.";
			for(Participante p: this.participante) {
				if(p.getEmail().equals(email)) {
					results = p.getNome();
				} 
			}
			return results;
		}
		
		
		
}

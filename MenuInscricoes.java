import java.util.ArrayList;
import java.util.Scanner;

public class MenuInscricoes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Participante> participante = new ArrayList<Participante>();
		SistemaInscricoes pessoa = new SistemaInscricoes(participante);
		boolean sair = false;

		while(sair==false) {
			System.out.println(" Digite 1 para cadastrar participante\n Digite 2 para remover participante\n Digite 3 para pesquisar participante de alguma instituição \n Digite 4 para pesquisar participantes de algum estado \n Digite 5 para pesquisar um participante \n Digite 6 para sair ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao) {
			
			case 1:
				String nome = input("Nome do participante: ", entrada);
				String email = input("Email: ", entrada);
				String instituicao = input("Instituição: ", entrada);
				String logradouro = input("Logradouro: ", entrada);
				String numero = input("Número: ", entrada);
				String cidade = input("Cidade: ", entrada);
				String estado = input("Estado: ", entrada);
				pessoa.cadastraParticipante(nome, email, instituicao, logradouro, numero, cidade, estado);
				System.out.println("Participante cadastrado com sucesso!");
				break;
				
			case 2: 
				String emailRemover = input("Email do participante: ", entrada);
				pessoa.removeParticipante(emailRemover);
				break;
				
			case 3:
				ArrayList<String> pessoasInstituto = new ArrayList<String>();
				String instituicaoAPesquisar = input("Instituição de interesse: ", entrada);
				pessoasInstituto = pessoa. pesquisaParticipantesDaInstituicao(instituicaoAPesquisar);
				if(pessoasInstituto.size()==0) {
					System.out.println("Nenhum resultado encontrado.");
				} else {
					for(String resultado: pessoasInstituto) {
						System.out.println(resultado);
					}
				}
				break;
				
			case 4:
				ArrayList<String> pessoasEstado= new ArrayList<String>();
				String estadoAPesquisar = input("Estado a pesquisar: ", entrada);
				pessoasEstado = pessoa.pesquisaParticipantesDoEstado(estadoAPesquisar);
				if(pessoasEstado.size() == 0) {
					System.out.println("Nenhum resultado encontrado.");
				} else {
					for(String resultado: pessoasEstado) {
						System.out.println(resultado);
					}
				}
				break;
				
			case 5:
				String emailAPesquisar = input("Email da pessoa: ", entrada);
				String resultado = pessoa.pesquisaParticipante(emailAPesquisar);
				System.out.println("Resultado: "+resultado);
				break;
				
			case 6:
				System.out.println("Até mais!");
				sair = true;
				break;
			
			case 7:
				pessoa.mostraParticipante();
				break;
				
			}
		}
	}
	
	private static String input(String textoMostrado, Scanner leitor) {
		System.out.print(textoMostrado);
		return leitor.nextLine();
	}
}

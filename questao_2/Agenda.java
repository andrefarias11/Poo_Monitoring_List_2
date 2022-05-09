package questao_2;

public class Agenda {

	private Contato[] contatos;

	public void newContato(Contato contato) {
		for (int i = 0; i < contatos.length; i++) { // ----------------------------------------------percore o array de
													// contatos
			if (contatos[i] == null) { // -------------------------------------------------------checa se a posição
										// percorrida é nula
				contatos[i] = contato; // ---------------------------------------------------se for nula, essa posição
										// agora é marcada com um novo contato
				contatos[i].estaNaAgenda = true;
				System.out.println("Contato " + contato.getNome() + " adicionado"); // ------notifica a adição de um
																					// contato
				break; // -------------------------------------------------------------------sai do
						// loop
			}
		}
	}

	public void removeContato(Contato contato) {
		for (int i = 0; i < contatos.length; i++) { // -----------------------------------------------percorre o array
													// de contatos
			if (contatos[i] == contato) { // -----------------------------------------------------checa se a posição
											// percorrida é o contato desejado
				contatos[i].estaNaAgenda = false;
				// --------------------------------------------------------------------------o
				// for abaixo faz com que os outros elementos do array sejam reposicionados
				for (int k = i; k < contatos.length - 1; k++)
					contatos[k] = contatos[k + 1];
				System.out.println("\nContato " + contato.getNome() + " removido\n"); // --------informa sobre a remoção
																						// do contato
				break; // -------------------------------------------------------------------sai do
						// loop
			}
		}
	}

	public boolean searchContato(String nome) { // ------------------------------------------------------usei boolean
												// para retornar se o contato existe ou não
		boolean status = false; // ------------------------------------------------------------------define uma
								// variável estado, por padrão false
		try { // ------------------------------------------------------------------------------------tenta
				// executar o seguinte código
			for (int i = 0; i < contatos.length; i++) { // --------------------------------------percorre o array
				if (contatos[i].getNome().equals(nome)) { // --------------------------------verifica se o nome do
															// elemento corrente é igual ao nome definido
					status = contatos[i].estaNaAgenda; // -------------------------------define a variável estado
					break; // -----------------------------------------------------------sai do loop
				}
			}
		} catch (Exception erro) { // ---------------------------------------------------------------captura um
									// erro se houver
			return false; // --------------------------------------------------------------------retorna
							// false se houver um erro inesperado
		}
		return status; // ----------------------------------------------------------------------------retorna
						// o se ele está ou não na agenda

	}

	public Agenda(int contatosMaximo) { // ---------------------------------------------------------------construtor da
										// classe Agenda com parâmetro para definir o número máximo de contatos
		contatos = new Contato[contatosMaximo]; // ---------------------------------------------------define o número
												// máximo de contatos conforme o número passado na assinatura
	}

}

package questao_2;

public class Questao_2 {
	public static void main(String[] args) {
		Contato andre = new Contato("André", "andre@gmail.com"); // --------------------------------------------------criar
																	// contato andre
		Contato amanda = new Contato("Amanda", "amanda@hotmail.com");// c---------------------------------------------criar
																		// contato amanda

		Agenda contatos = new Agenda(10); // -------------------------------------------------------------------------criar
											// agenda com max 10 contatos

		contatos.newContato(amanda); // ------------------------------------------------------------------------adicionar
										// amanda
		contatos.newContato(andre); // -------------------------------------------------------------------------adicionar
									// andre

		System.out.println("\nO contato André existe? " + contatos.searchContato("André")); // -------------------------buscar
																							// "André" existe, nesse
																							// caso imprime true, pois
																							// foi adicionado
		System.out.println("O contato Amanda existe?" + contatos.searchContato("Amanda"));// -------------------------buscar
																							// "Amanda" existe, nesse
																							// caso imprime true, pois
																							// foi adicionado

		contatos.removeContato(andre); // ---------------------------------------------------------------------------remover
										// "André"
		System.out.println("O contato Amanda existe? " + contatos.searchContato("Amanda"));// ------------------------buscar
																							// Amanda
		System.out.println("O contato André existe? " + contatos.searchContato("André")); // -------------------------busco
																							// André, aqui imprime
																							// false, pois eu acabei de
																							// removê-lo

	}

}

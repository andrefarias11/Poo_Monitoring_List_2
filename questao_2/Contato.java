package questao_2;

public class Contato {
	// criar classe contato
	private String nome;
	private String email;

	public boolean estaNaAgenda;

	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	// get e set pra nn esquecer
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

}

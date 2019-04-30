package Es1_RubricaTelefono;

public class Persona
{
	private String nome;
	private String cognome;
	private String numTel;
	
	public Persona(String nome, String cognome, String numTel) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.numTel = numTel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	
	@Override
	public String toString() {
		return nome + "|" + cognome + "|" + numTel;
	}
	
}

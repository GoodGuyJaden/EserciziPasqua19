package EsQuiz;

import java.io.Serializable;

public class Risposta implements Serializable {
	private String risposta;
	private boolean isCorretta;

	public Risposta(String risposta, boolean isCorretta) {
		this.risposta = risposta;
		this.isCorretta = isCorretta;
	}
	
	public Risposta(String risposta) {
		this.risposta = risposta;
		this.isCorretta = false;
	}

	public String getRisposta() {
		return risposta;
	}

	public boolean isCorretta() {
		return isCorretta;
	}

}

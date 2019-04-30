package EsQuiz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Domanda implements Serializable 
{
	private String domanda;
	private List<Risposta> risposte = new ArrayList<>();

	public Domanda(String domanda) {
		this.domanda = domanda;
	}
	
	public void setRisposta(Risposta r)
	{
		risposte.add(r);
	}

	public String getDomanda() {
		return domanda;
	}

	public List<Risposta> getRisposte() {
		return risposte;
	}

}

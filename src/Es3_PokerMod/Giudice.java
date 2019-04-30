package Es3_PokerMod;

public class Giudice 
{
	
	private String giocatore;
	private int sommaGioc = 0;
	private int sommaPC0 = 0;
	private int vittorieGioc = 0;
	private int vittoriePC0 = 0;
	
	public void calcola(ManoGioco m, String giocatore)
	{													
		int somma = 0;
		int var = 0;
		int conta = 0;
		while(m.getMano().size() > 0)
		{
			var = m.getMano().get(0);
			
			for (int j = 0; j < m.getMano().size(); j++)
			{
				if(var == m.getMano().get(j))
				{
					conta++;
					m.getMano().remove(j);
					j = -1;
				}
				if(j == m.getMano().size()-1)
				{
					if(conta > 1)
					{
						somma += var*conta;
					}
					conta = 0;
				}
			}
		}
		
		if(!giocatore.equals("PC0"))
		{
			this.giocatore = giocatore;
			sommaGioc = somma;
		}
		else sommaPC0 = somma;
		
	}
	
	public void checkMani()
	{
		if(sommaGioc > sommaPC0) 
		{
			vittorieGioc++;
			System.out.println("Round vinto dal giocatore: " + giocatore + "(" + sommaGioc + ")" + "   (" + sommaPC0 + ")PC0" + "\n");
		}
		else if(sommaGioc < sommaPC0)
		{
			vittoriePC0++;
			System.out.println("Round vinto dal computer: PC0(" + sommaPC0 + ")   (" + sommaGioc + ")" + giocatore + "\n");
		}
		else
		{
			vittorieGioc++;
			vittoriePC0++;
			System.out.println("Round pari: " + sommaPC0 + "\n");
		}
		sommaGioc = 0;
		sommaPC0 = 0;
	}
	
	public String vincitore()
	{
		return (vittorieGioc > vittoriePC0 ? "Vince " + this.giocatore + " con un punteggio di " + vittorieGioc + " : " + vittoriePC0:
			   (vittoriePC0 < vittorieGioc) ? "Vince PC0 con un punteggio di " + vittoriePC0 + " : " + vittorieGioc : 
				"Parità");
		
	}

}

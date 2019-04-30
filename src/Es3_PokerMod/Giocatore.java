package Es3_PokerMod;

import java.util.ArrayList;
import java.util.List;

public class Giocatore 
{
	private String nome;
	private ManoGioco mG = new ManoGioco();
	private List<ManoGioco> storico = new ArrayList<>();
	
	public Giocatore(String nome) {
		this.nome = nome;
	}

	public void gioca()
	{
		mG.gioca();
		ManoGioco mg = new ManoGioco(mG);
		storico.add(mg);
		
	}
	
	public ManoGioco getmG() {
		return mG;
	}

	public String getNome() {
		return nome;
	}

	public String getStorico()
	{
		String output = "";
		for(int i = 0; i < storico.size(); i++)
		{
			
		}
		return output;
	}
	
	public List<ManoGioco> getStorico2()
	{
		return storico;
	}
	
	public static void main(String[] args) {
		Giocatore g = new Giocatore("");
		g.gioca();
		g.gioca();
		g.gioca();
		System.out.println(g.getStorico2());
	}
}

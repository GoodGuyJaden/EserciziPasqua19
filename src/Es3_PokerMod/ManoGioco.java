package Es3_PokerMod;
import java.util.ArrayList;
import java.util.List;

import Es2_LancioDadi.Dado;

public class ManoGioco
{
	private Dado d = new Dado();
	private List<Integer> mano= new ArrayList<>();
	
	public ManoGioco()
	{
		
	}
	
	public ManoGioco(ManoGioco m)
	{
		this.mano = m.getMano();
	}
	
	public void gioca()
	{
		for(int i = 0; i < 5; i++)
		{
			mano.add(d.lancio());
		}
	}
	
	public void reset()
	{
		mano.clear();
	}

	public List<Integer> getMano() {
		return mano;
	}
	
	@Override
	public String toString()
	{
		String output = "";
		for(Integer i : mano)
		{
			output += i.toString() + "  ";
		}
		return output;
	}
}

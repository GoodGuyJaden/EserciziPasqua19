package Es2_LancioDadi;

import java.util.ArrayList;
import java.util.List;

public class Dado 
{
	private int valore;
	private List<Integer> storia = new ArrayList<>();
		
	public int lancio()
	{
		valore = (int)(Math.random()*6+1);
		if(storia.size()==10)
		{
			storia.remove(0);
			storia.add(new Integer(valore));
			
		}else storia.add(new Integer(valore));
		
		return valore;
	}
	
	public String storiaLanci()
	{
		String output = "Storico\n";		
		for(int i = 0; i < storia.size(); i++)
		{
			output += i+ ") " +storia.get(i).toString() + "\n";
		}
		return output;
	}
	
	public String storiaLanci(int indice)
	{		
		return ((indice >= storia.size() || indice < 0) ? "Solo da 0 a " + storia.size() + "!!" : "Lancio " + indice + ") " + storia.get(indice).toString() + "\n");
	}
}

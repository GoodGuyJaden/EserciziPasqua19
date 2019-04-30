package Es1_RubricaTelefono;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Rubrica 
{
	private Set<Persona> rubrica = new HashSet<>();
	private File f = new File("Rubrica.txt");
	
	public Rubrica()
	{
		try
		{
			if(!f.exists()) f.createNewFile();
			else
			{
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine())
				{
					String [] persona = sc.nextLine().split("\\|");
					rubrica.add(new Persona(persona[0], persona[1], persona[2]));
				}
				sc.close();
			}
		}
		catch(IOException e)
		{
			
		}
		
	}
	
	public void add(Persona p)
	{
		rubrica.add(p);
	}
	
	public Set<Persona> getByNome(String nome) throws Exception
	{
		Set<Persona> contatti = new HashSet<>();
		
		for(Persona p : rubrica)
		{
			if(p.getNome().equalsIgnoreCase(nome))
			{
				contatti.add(p);
			}
		}
		
		if(contatti.size() == 0) throw new Exception("Nessun contatto trovato con questo nome");
		else return contatti;
	}
	
	public Set<Persona> getByCogn(String cognome) throws Exception
	{
		Set<Persona> contatti = new HashSet<>();
		
		for(Persona p : rubrica)
		{
			if(p.getCognome().equalsIgnoreCase(cognome))
			{
				contatti.add(p);
			}
		}
		
		if(contatti.size() == 0) throw new Exception("Nessun contatto trovato con questo cognome");
		else return contatti;
	}
	
	public Set<Persona> getByNum(String numTel) throws Exception
	{
		Set<Persona> contatti = new HashSet<>();
		
		for(Persona p : rubrica)
		{
			if(p.getNumTel().equalsIgnoreCase(numTel))
			{
				contatti.add(p);
			}
		}
		
		if(contatti.size() == 0) throw new Exception("Nessun contatto trovato con questo numero di telefono");
		else return contatti;
	}

	public List<Persona> sortRub()
	{
		List<Persona> rubricaOrdinata = new ArrayList<>(rubrica);
		Collections.sort(rubricaOrdinata, (a, b) -> a.getNome().compareToIgnoreCase(b.getNome()));
		return rubricaOrdinata;
	}
	
	public void salva()
	{
		try {
			PrintWriter pw = new PrintWriter(f);
			
			for(Persona p : sortRub())
			{
				pw.println(p);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void remove()
	{
		
	}
	
	@Override
 	public String toString()
	{
		
		String output = "";
		for(Persona p : sortRub())
		{
			output += p.toString() + "\n";
		}
		return output;
	}
}

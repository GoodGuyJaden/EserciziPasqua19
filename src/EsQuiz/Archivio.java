package EsQuiz;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Archivio 
{
	private List<Domanda> archivio = new ArrayList<>();
	private File f = new File("ArchivioDomande.txt");
	
	public void add(Domanda d)
	{
		archivio.add(d);
	}
	
	
	public static void main(String[] args) {
		
		Archivio arc = new Archivio();
		String scelta = "";
		Scanner sc = new Scanner(System.in);
		
		while(!scelta.equals("000"))
		{
			System.out.println("Inserisci 000 per chiudere il programma\nInserisci 1 per aggiungere domande");
			scelta = sc.nextLine();
			
			switch (scelta) {
			case "1":
				System.out.println("Inserisci il testo della domanda");
				String domanda = sc.nextLine();
				Domanda d = new Domanda(domanda);
				System.out.println("Inserisci quante risposte ha questa domanda");
				try
				{
					int n = Integer.parseInt(sc.nextLine().replaceAll("\\D+", ""));
					for(int i = 0; i < n; i++)
					{
						System.out.println("Inserisci il testo della risposta");
						String risposta = sc.nextLine();
						System.out.println("è la risposta giusta? '1' per si -- '0' per no");
						int isCorretta = Integer.parseInt(sc.nextLine().replaceAll("\\D+", ""));
						if(isCorretta == 1) d.setRisposta(new Risposta(risposta, true));
						else d.setRisposta(new Risposta(risposta));
						arc.add(d);
					}
				}
				catch(InputMismatchException e)
				{
					
				}
				
				break;

			case "000":
				//scrittura su file
				break;
			default:
				break;
			}
		}
	}
}

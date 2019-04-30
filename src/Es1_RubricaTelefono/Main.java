package Es1_RubricaTelefono;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rubrica r = new Rubrica();
		String scelta = "0";
		String nome = "";
		String cognome = "";
		String numTel = "";

		while (!scelta.equals("9")) {
			System.out.println("Inserisci '0' per aggiungere una persona alla rubrica\n" +
							   "Inserisci '1' per cercare un contatto tramite nome\n" +
							   "Inserisci '2' per cercare un contatto tramite cognome\n" +
							   "Inserisci '3' per cercare un contatto tramite numero di telefono\n" +
							   "Inserisci '4' per rimuovere un contatto\n" +
							   "Inserisci '5' per stampare tutta la rubrica\n" +
							   "Inserisci '6' per salvare la rubrica\n" + 
							   "Inserisci '9' per chiudere il programma");
			scelta = sc.nextLine();
			nome = "";
			cognome = "";
			numTel = "";
			try {
				switch (scelta) {
				case "0":
					
					while (nome.equals("")) {
						System.out.println("Inserisci il nome");
						nome = sc.nextLine().replaceAll("[^a-z A-Z]", "");
					}
					while (cognome.equals("")) {
						System.out.println("Inserisci il cognome");
						cognome = sc.nextLine().replaceAll("[^a-z A-Z]", "");
					}
					while (numTel.equals("") /*|| numTel.length() != 10*/) {
						System.out.println("Inserisci il numero di telefono");
						numTel = sc.nextLine().replaceAll("\\D+", "");
					}
					r.add(new Persona(nome, cognome, numTel));
					//scelta = "2";				possibile opzione da valutare attentamente senza usare 'break'
					break;
					
				case "1":
					
					while (nome.equals("")) {
						System.out.println("Inserisci il nome");
						nome = sc.nextLine().replaceAll("[^a-zA-Z]", "");
					}
					System.out.println("\n" + r.getByNome(nome) + "\n");
					break;
					
				case "2":
					
					while (cognome.equals("")) {
						System.out.println("Inserisci il cognome");
						cognome = sc.nextLine().replaceAll("[^a-zA-Z]", "");
					}
					System.out.println("\n" + r.getByCogn(cognome) + "\n");
					break;
					
				case "3":
					
					while (numTel.equals("") /*|| numTel.length() != 10*/) {
						System.out.println("Inserisci il numero di telefono");
						numTel = sc.nextLine().replaceAll("\\D+", "");
					}
					System.out.println("\n" + r.getByNum(numTel) + "\n");
					break;
					
				case "4":
					
					
					break;
					
				case "5":
					
					System.out.println(r);
					break;
					
				case "6":
					
					r.salva();
					System.out.println("Rubrica salvata.");
					break;
					
				case "9":
					
					r.salva();
					System.out.println("Chiusura..");
					break;
					
				default:
					
					System.out.println("Inserisci solo opzioni consentite");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		sc.close();
	}
}

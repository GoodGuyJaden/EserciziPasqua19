package Es3_PokerMod;

public class Main 
{
	public static void main(String[] args) {
		
		Giocatore player = new Giocatore("Alfo");
		Giocatore computer = new Giocatore("PC0");
		Giudice g = new Giudice();
		for(int i = 0; i < 10; i++) 
		{
			//lancia giocatore
			player.gioca();
			System.out.println("Mano di " + player.getNome() + ": " + player.getmG());
			g.calcola(player.getmG(), player.getNome());
			//lancia computer
			computer.gioca();
			System.out.println("Mano di " + computer.getNome() + ": " + computer.getmG());
			g.calcola(computer.getmG(), computer.getNome());
			//controllo chi vince questa mano			
			g.checkMani();
			//svuoto le mani
			player.getmG().reset();
			computer.getmG().reset();
		}
		System.out.println(g.vincitore());
		System.out.println(player.getStorico());
		System.out.println(computer.getStorico());
	}
}

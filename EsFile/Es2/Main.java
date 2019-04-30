package Es2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File a = new File("a.txt");
		File b = new File("es2_b.txt");
		int contaChar = 0;
		int contaRighe = 0;
		try {
			if(!a.exists())a.createNewFile();
			if(!b.exists()) b.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try
		{
			Scanner sc = new Scanner(a);
			PrintWriter pw = new PrintWriter(b);
			
			while(sc.hasNextLine())
			{
				String s = sc.nextLine();
				contaRighe++;
				contaChar += s.length();
			}
			pw.print("Numero righe lette (" + contaRighe + "): ");
			for(int i = 0; i < contaRighe; i++)
			{
				pw.print('x');
			}
			pw.println();
			pw.print("Numero char letti (" + contaChar + "): ");
			for(int i = 0; i < contaChar; i++)
			{
				pw.print('y');
			}
			sc.close();
			pw.close();
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}

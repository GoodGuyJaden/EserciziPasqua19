package Es1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		File a = new File("a.txt");
		File b = new File("b.txt");
		
		
		
		try {
			if(!a.exists())a.createNewFile();
			if(!b.exists()) b.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try
//		{
//			PrintWriter pw = new PrintWriter(a);
//			pw.println("0)Lorem ipsum dolor sit amet, consectetur adipiscing elit\n." + 
//			"1)In ullamcorper ipsum eu ornare dictum.\n" +
//			"2)Nulla purus diam, iaculis at justo vel, porttitor accumsan ante.\n" +
//			"3)Aliquam interdum ipsum ante, non posuere magna ullamcorper sed.\n" +
//			"4)Vivamus tempor dui ut metus eleifend convallis.\n" +
//			"5)Sed lorem odio, semper quis feugiat at, imperdiet sit amet erat.\n" +
//			"6)Praesent sed rutrum felis.\n" +
//			"7)Curabitur semper at libero id rutrum.\n" +
//			"8)In libero ex, pulvinar non mattis vel, semper eget dolor.\n" +
//			"9)Vestibulum nec commodo nibh, in mattis diam.");
//			pw.close();
//		}catch(FileNotFoundException e)
//		{
//			
//		}
		
		try {
			Scanner sc = new Scanner(a);
			PrintWriter pw = new PrintWriter(b);
			for(;sc.hasNextLine();)
			{
				String s = sc.nextLine();
				System.out.println(s);
				pw.println(s);
				sc.nextLine();
			}
			sc.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

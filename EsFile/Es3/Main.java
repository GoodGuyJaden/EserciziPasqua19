package Es3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File a = new File("es3_f1.txt");
		File b = new File("es3_f2.txt");
		File c = new File("es3_unione.txt");
		
		
		try {
			if(!a.exists()) a.createNewFile();
			if(!b.exists()) b.createNewFile();
			if(!c.exists()) c.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			PrintWriter pwA = new PrintWriter(a);
//			PrintWriter pwB = new PrintWriter(b);
//			
//			pwA.println("0)Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n" + 
//						"1)In vitae orci rutrum, tincidunt erat in, vehicula ligula.\r\n" + 
//						"2)Pellentesque et mauris sit amet dui fringilla rhoncus ut facilisis leo.\r\n" + 
//						"3)Quisque posuere dui a consectetur pharetra.");
//			
//			pwB.println("0)Integer eget nulla aliquam neque finibus congue at nec velit.\r\n" + 
//						"1)Aliquam vehicula metus et sem mattis convallis.\r\n" + 
//						"2)Praesent a magna ut ipsum scelerisque commodo.\r\n" + 
//						"3)Ut ac diam lacinia, lacinia ipsum euismod, euismod felis.");
//			
//			pwA.close();
//			pwB.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			Scanner scA = new Scanner(a);
			Scanner scB = new Scanner(b);
			PrintWriter pw = new PrintWriter(c);
			
			for(int i = 0;scA.hasNextLine() || scB.hasNextLine(); i++)
			{
				String s;
				if(i%2 == 0) s = scA.nextLine();
				else s = scB.nextLine();
				pw.println(s);
			}
			
			scA.close();
			scB.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

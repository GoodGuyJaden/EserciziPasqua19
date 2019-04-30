package Es2_LancioDadi;

public class Test 
{
	public static void main(String[] args) {
		Dado d = new Dado();
		
		
		for(int i = 0; i < 27; i++)
		{
			System.out.println(i+") " + d.lancio());
		}
		
		System.out.println(d.storiaLanci());
		System.out.println(d.storiaLanci(2));
		System.out.println(d.storiaLanci(5));
		System.out.println(d.storiaLanci(8));
	}
}

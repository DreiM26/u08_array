// u8_array
// auf8.2

public class GehaltsBuchhaltung2
{
	public static void main(String [] args)
	{
		int[] gehalt;

		gehalt = new int[5];

		gehalt[0] = 1200;
		gehalt[1] = 4000;
		gehalt[2] = 1000;
		gehalt[3] = 700;
		gehalt[4] = 1100;

		for (int i = 0; i < gehalt.length ; i++)
		{
			System.out.println(gehalt[i]);
		}
		
		System.out.println();
		
		int gesamtsumme = 0;

		for (int i = 0; i < gehalt.length ; i++)
		{
			gesamtsumme = gesamtsumme + gehalt[i];	
		}
		int x = gehalt.length;
		System.out.println();
		System.out.println("Durchschnitt: " + (gesamtsumme/x));
	}
}

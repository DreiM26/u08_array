// u08_array
// auf8.3

public class GehaltsBuchhaltung3
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

		int minimunGehalt = gehalt[0];

		for (int i = 0; i < gehalt.length ; i++)
		{
			minimunGehalt = Math.min(minimunGehalt, gehalt[i]);
		}
		
		System.out.println("Minimun Gehalt ist: " + minimunGehalt);
	}
}

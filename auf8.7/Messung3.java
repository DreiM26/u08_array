// u08_array
// auf8.7

import java.util.Scanner;

public class Messung3
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		int maxMessDaten = 10;	

		double[] messreihe = new double[maxMessDaten];

		Statistik statistik = new Statistik();  //WICHTIG!!!!!

		int i = 0;
		String messDatenString;
	
		while (i < maxMessDaten)
		{
			System.out.println("Gebe bitte eine Temperaturwert " + (i+1) + " :");
			messDatenString = scanner.nextLine();
		
			if (messDatenString.isEmpty())
			{
				System.out.println("Eingabe fertig! ");
				System.out.println();
			// int finali = i;

		// DURCHSCHNITTSWERT
			double durchschnittAusgabe = statistik.durchschnitt(messreihe,i);
			System.out.println();
			System.out.println("Durchschnitt: ");
			System.out.println("==============");
			System.out.println(durchschnittAusgabe);

			double minimunAusgabe = statistik.minimun(messreihe,i);
			System.out.println();
			System.out.println("Minimun: ");
			System.out.println("==============");
			System.out.println(minimunAusgabe);

			double maximusAusgabe = statistik.maximun(messreihe,i);
			System.out.println();
			System.out.println("Maximun: ");
			System.out.println("==============");
			System.out.println(maximusAusgabe);
			break;
			}
		
		messreihe[i] = Double.parseDouble(messDatenString);
		i++;
		}
	}
}

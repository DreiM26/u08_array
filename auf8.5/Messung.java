// u08_array
// auf8.5

import java.util.Scanner;

public class Messung
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		double[] messDaten;
		int maxMessDaten = 10;
		messDaten = new double[maxMessDaten];

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
				double finali = i;

					System.out.println("Alle gelieferte Temperaturwerte waren: ");
					System.out.println("=======================================");
					for (int j = 0; j < finali; j++)
					{					
						System.out.println("Temperaturwert N° " + (j+1) + " ist: " + messDaten[j]);
					}

					System.out.println();
					System.out.println("Durchchnittswert :");
					System.out.println("==================");			
					double gesamtMessDaten = 0;
					for(int z = 0; z < finali; z++)
					{							
						gesamtMessDaten = gesamtMessDaten + messDaten[z];
					}
					System.out.println((gesamtMessDaten)/finali);
								
				break;
			}
			messDaten[i] = Double.parseDouble(messDatenString);
			i++;
		}
		
	}
}

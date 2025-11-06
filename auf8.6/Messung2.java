// u08_array
// auf8.6

import java.util.Scanner;

public class Messung2
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
	
					// GELIEFERTE TEMPERATUREN
					System.out.println("Alle gelieferte Temperaturwerte waren: ");
					System.out.println("=======================================");
					for (int j = 0; j < finali; j++)
					{					
						System.out.println("Temperaturwert N° " + (j+1) + " ist: " + messDaten[j]);
					}

					// DURCHSCHNITTSWERT
					System.out.println();
					System.out.println("Durchschnittswert :");
					System.out.println("==================");			
					double gesamtMessDaten = 0;
					for(int z = 0; z < finali; z++)
					{							
						gesamtMessDaten = gesamtMessDaten + messDaten[z];
					}
					System.out.println((gesamtMessDaten)/finali);

					//MINIMUN
					double minimunTemp = messDaten[i];

						for (int k = 0; k < finali ; k++)
						{
							minimunTemp = Math.min(minimunTemp, messDaten[k]);
						}
						System.out.println();	
						System.out.println("Kleinsten Temperaturewert: ");
						System.out.println("===========================");						
						System.out.println(minimunTemp);

					//MAXIMUs
					double maximusTemp = messDaten[i];

						for (int l = 0; l < finali ; l++)
						{
							maximusTemp = Math.max(maximusTemp, messDaten[l]);
						}	
						System.out.println();						
						System.out.println("Größten Temperaturewert: ");
						System.out.println("===========================");						
						System.out.println(maximusTemp);
						System.out.println();

				break;
			}
			messDaten[i] = Double.parseDouble(messDatenString);
			i++;
		}
		
	}
}

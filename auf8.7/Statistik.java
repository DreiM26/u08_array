// u08_array
// auf8.7

public class Statistik
{
		public static double durchschnitt(double[] messreihe, int finali)
    	{
			double gesamtMessDaten = 0;
			
			for(int i = 0; i < finali; i++)
			{							
				gesamtMessDaten = gesamtMessDaten + messreihe[i];
			}
				return (gesamtMessDaten/finali);
    	}


    	public static double minimun(double[] messreihe, int finali)
    	{
			double minimunTemp = messreihe[0];

			for (int i = 0; i < finali ; i++)
			{
				minimunTemp = Math.min(minimunTemp, messreihe[i]);
			}
        	return minimunTemp;
    	}

    	public static double maximun(double[] messreihe, int finali)
    	{
			double maximusTemp = messreihe[0];

        	for (int i = 0; i < finali ; i++)
			{
				maximusTemp = Math.max(maximusTemp, messreihe[i]);
			}	
			return maximusTemp;
    	}   
}



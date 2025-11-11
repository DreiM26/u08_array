// u08_array
// auf8.16

public class Regen8
{
	public static void main(String[] args)
	{
   	int[][][] niederschlags = { { {0,3},{ 5,2},{0,0},{10,0},{11,5} },		// Nord
                                  { {2,3},{ 1,0},{0,0},{ 0,0},{ 0,6} },		// Mitte
                                  { {3,1},{12,6},{1,2},{ 0,0},{ 0,2} } };	// Sued

	//	String[] wochentage = {"Mo", "Di", "Mi", "Do", "Fr"};
	//	String[] region     = {"Nord", "Mitte", "Sued"};

			double durchschnittRegionNord		= 0.0;
			double durchschnittRegionMitte	= 0.0;
			double durchschnittRegionSued		= 0.0;

		for(int r = 0; r < niederschlags.length; r++)
		{
			int gesamtRegion = 0; 

			for(int t = 0; t < niederschlags[r].length; t++)
			{
				for(int w = 0; w < niederschlags[r][t].length; w++)
				{
					int regen = niederschlags[r][t][w];
					gesamtRegion += regen;
				}
			}

			if(r == 0)
			{
				durchschnittRegionNord = (double) gesamtRegion / niederschlags[0].length;
			}
			else if(r == 1)
			{
				durchschnittRegionMitte = (double) gesamtRegion / niederschlags[0].length;
			}
			else if(r == 2)
			{
				durchschnittRegionSued = (double) gesamtRegion / niederschlags[0].length;
			}
		}
		System.out.println();		
		System.out.println("Tagesdurchschnitt (mm):	Nord " + durchschnittRegionNord + "   Mitte " + durchschnittRegionMitte + "   Sued " + durchschnittRegionSued);	

		System.out.println();
		
	}
}


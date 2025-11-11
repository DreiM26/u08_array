// u08_array
// auf8.15

//////////////////////////////////////////
// INT [3][5][2]
// INT [r][t][w]
// [Region (3)][Wochentage (5)][Wann (2)]
// --------------------------------------
// Region     : 0 = Nord
//              1 = Mitte
//              2 = Süd
// Wochentage : 0 = Mo
//              1 = Di
//              2 = Mi
//              3 = Do
//              4 = Fr
// Wann       : 0 = morgens
//              1 = abends
/////////////////////////////////////////

public class Regen7
{
	public static void main(String[] args)
	{
   	int[][][] niederschlags = { { {0,3},{ 5,2},{0,0},{10,0},{11,5} },		// Nord
                                  { {2,3},{ 1,0},{0,0},{ 0,0},{ 0,6} },		// Mitte
                                  { {3,1},{12,6},{1,2},{ 0,0},{ 0,2} } };	// Sued

	//	String[] wochentage = {"Mo", "Di", "Mi", "Do", "Fr"};
	//	String[] region     = {"Nord", "Mitte", "Sued"};

///// Iteration x Region
			int gesamtRegionNord		= 0;
			int gesamtRegionMitte	= 0;
			int gesamtRegionSued		= 0;

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
				gesamtRegionNord = gesamtRegion;
			}
			else if(r == 1)
			{
				gesamtRegionMitte = gesamtRegion;
			}
			else if(r == 2)
			{
				gesamtRegionSued = gesamtRegion;
			}
		}
		System.out.println();		
		System.out.println("Summe (mm):	Nord " + gesamtRegionNord + "   Mitte " + gesamtRegionMitte + "   Sued " + gesamtRegionSued);	

			int gesamtMO = 0;
			int gesamtDI = 0;
			int gesamtMI = 0;
			int gesamtDO = 0;
			int gesamtFR = 0;

		for(int t = 0; t < niederschlags[0].length; t++)
		{
			int gesamtProTag = 0;

			for(int r = 0; r < niederschlags.length; r++)
			{
				for(int w = 0; w < niederschlags[r][t].length ; w++)
				{
				int regenProTag = niederschlags[r][t][w];
				gesamtProTag += regenProTag;
				}
			}

			if(t==0)
			{
				gesamtMO = gesamtProTag;
			}

			if(t==1)
			{
				gesamtDI = gesamtProTag;
			}

			if(t==2)
			{
				gesamtMI = gesamtProTag;
			}

			if(t==3)
			{
				gesamtDO = gesamtProTag;
			}

			if(t==4)
			{
				gesamtFR = gesamtProTag;
			}
		}
		System.out.println("Summe (mm):	Mo " + gesamtMO + "     Di " + gesamtDI + "      Mi " + gesamtMI + "     Do " + gesamtDO + "     Fr " + gesamtFR);
		System.out.println();
		
	}
}


// u08_array
// auf8.11

public class Regen3
{
	public static void main(String [] args)
	{
						         //   Montag  Dienstag  Mitwoch  Donnerstag  Freitag
		int [][] niederschlag = {{   3,        7,      0,       10,         16  },		 // Nord
                               {   5,        1,      0,        0,          6  },	    // Mitte
							          {   4,       18,      3,        0,          2  }};    // Sued

//		int[] region    = {"Region Nord", "Region Mitte", "Region Süd"}
//		int[] wochentag = {"Montag", "Dienstag", "Mittwoch", "Doonerstag", "Freitag"}
//    int[][] niederschlag = { region, wochentag };

//		int gesamt = 0;
		
		for (int region = 0; region < niederschlag.length; region++)
		{
			int gesamt = 0;

			for (int wochentag = 0; wochentag < niederschlag[region].length; wochentag++)
			{
			int regennn = niederschlag[region][wochentag];
			gesamt += regennn;
         }
		   System.out.println(gesamt);

       }
	}
}

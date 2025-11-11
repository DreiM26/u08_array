// u08_array
// auf8.9

public class Regen
{
	public static void main(String [] args)
	{
						    //   Montag  Dienstag  Mitwoch  Donnerstag  Freitag
		int [][] niederschlag = {{   3,        7,      0,       10,         16  },		// Nord
                               {   5,        1,      0,        0,          6  },	   // Mitte
							          {   4,       18,      3,        0,          2  }};    // Sued

//		int[] region    = {"Region Nord", "Region Mitte", "Region Süd"}
//		int[] wochentag = {"Montag", "Dienstag", "Mittwoch", "Doonerstag", "Freitag"}

		
		for (int region = 0; region < niederschlag.length; region++)
		{
			for (int wochentag = 0; wochentag < niederschlag[region].length; wochentag++)
			{
				System.out.println(niederschlag[region][wochentag]+ " ");
			}
		}	

	}
}

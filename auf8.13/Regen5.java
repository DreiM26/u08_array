// u08_array
// auf8.13

public class Regen5
{
	public static void main(String [] args)
	{
						         //   Montag  Dienstag  Mittwoch  Donnerstag  Freitag
	//	int [][] niederschlag = {{   3,        7,      0,       10,         16  },		 // Nord
   //                          {   5,        1,      0,        0,          6  },	    // Mitte
	//						          {   4,       18,      3,        0,          2  }};    // Sued

						         //     Nord  Mitte  Sued
		int [][] niederschlag = {{   3,    5,    4,   },		 // Montag
                               {   7,    1,   18,   },	    // Dienstag
							          {   0,    0,    3,   },       // Mittwoch
                               {   10,   0,    0,   },	    // Donnerstag
							          {   16,   6,    2,   }};      // Freitag

//		int[] region    = {"Region Nord", "Region Mitte", "Region Süd"};
//		int[] wochentag = {"Montag", "Dienstag", "Mittwoch", "Doonerstag", "Freitag"};
//    int[][] niederschlag = { region, wochentag };

      int gesamtMontag      = 0;
      int gesamtDienstag    = 0;
      int gesamtMittwoch    = 0;	
      int gesamtDonnerstag  = 0;	
      int gesamtFreitag     = 0;	

		for (int wochentag = 0; wochentag < niederschlag.length; wochentag++)
		{
			int gesamt = 0;
			for (int region = 0; region < niederschlag[wochentag].length; region++)
			{
			int regennn = niederschlag[wochentag][region];
			gesamt += regennn;
			}
	//		System.out.println(gesamt);

			if (wochentag == 0)
			{
         	gesamtMontag = gesamt;
         }
			else if (wochentag == 1)
			{
            gesamtDienstag = gesamt;
         }
			else if (wochentag == 2)
			{
            gesamtMittwoch = gesamt;
			}
			else if (wochentag == 3)
			{
            gesamtDonnerstag = gesamt;
         }
			else if (wochentag == 4)
			{
            gesamtFreitag = gesamt;
			}

      }
		System.out.println("Summe (mm):    Mo " + gesamtMontag + "    Di " + gesamtDienstag + "    Mi " + gesamtMittwoch + "    Do " + gesamtDonnerstag + "    Fr " + gesamtFreitag);
		System.out.println();
	}
}

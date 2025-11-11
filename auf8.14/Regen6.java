// u08_array
// auf8.14

public class Regen6
{
	public static void main(String [] args)
	{
						         //   Montag  Dienstag  Mitwoch  Donnerstag  Freitag
		int [][] niederschlag = {{   3,        7,      0,       10,         16  },		 // Nord
                               {   5,        1,      0,        0,          6  },	    // Mitte
							          {   4,       18,      3,        0,          2  }};    // Sued

		double durchschnittNord  = 0.0;
		double durchschnittMitte = 0.0;
		double durchschnittSued  = 0.0;

      int gesamtNord  = 0;
      int gesamtMitte = 0;
      int gesamtSued  = 0;	

		for (int region = 0; region < niederschlag.length; region++)
		{
			int gesamt = 0;
			for (int wochentag = 0; wochentag < niederschlag[region].length; wochentag++)
			{
			int regennn = niederschlag[region][wochentag];
			
			gesamt += regennn;
			}
			double taeglich = niederschlag[region].length;

			double durchschnitt = gesamt / taeglich;
			
	//		System.out.println(gesamt);

			if (region == 0)
			{
         	gesamtNord = gesamt;
				durchschnittNord = durchschnitt;
         }
			else if (region == 1)
			{
            gesamtMitte = gesamt;
				durchschnittMitte = durchschnitt;
         }
			else if (region == 2)
			{
            gesamtSued = gesamt;
				durchschnittSued = durchschnitt;
			}
      }
		System.out.println("Tagesdurchschnitt (mm):  Nord " + durchschnittNord + "   Mitte " + durchschnittMitte + "   Sued " + durchschnittSued);
		System.out.println();
	}
}

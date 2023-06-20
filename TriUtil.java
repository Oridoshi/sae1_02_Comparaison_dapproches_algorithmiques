public class TriUtil
{
	public static int[] trierSelection(int[] tab)
	{		
		/*******************/
		/*    Variables    */
		/*******************/
		
		int max;
		int selectSize;
		int iMax;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		max = 0;
		iMax = 0;
		
		selectSize = tab.length - 1;
		
		while (selectSize > 0)
		{
		
			max = 0;
			
			for (int cpt=0; cpt <= selectSize; cpt++)
			{
			
				if (tab[cpt] >= max) {
				
					max = tab[cpt];
					iMax = cpt;
				
				}
			
			}
			
			TriUtil.permuter(tab, iMax, selectSize);
			
			selectSize--;
		
		}
		
		return tab;
	
	}
	
	public static int[] trierBulle(int[] tab)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		boolean echange;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		echange = true;
		
		while (echange)
		{
		
			echange = false;
			
			for (int cpt = 1; cpt < tab.length; cpt++)
			{
			
				if (tab[cpt] < tab[cpt - 1])
				{
				
					permuter(tab, cpt, cpt - 1);

					echange = true;
				
				}
			
			}
		
		}
		
		return tab;
	
	}
	
	public static int[] trierInsertion(int[] tab)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		int echange, ind;
		
		/**********************/
		/*    Instructions    */
		/**********************/

        for (int cpt1 = 1; cpt1 < tab.length; cpt1++)
        {
            echange = tab[cpt1];

            ind = cpt1;

            while ( ind > 0 && tab[ind-1] > tab[cpt1])
            {
                ind--;
            }
            if (ind != cpt1)
            {
                for (int cpt2 = cpt1; cpt2 > ind; cpt2--)
                {
                    tab[cpt2] = tab[cpt2-1];
                }

                tab[ind] = echange;
			}
		}

		return tab;
	}
	
	public static boolean estTrie(int[] tab)
	{
		/**********************/
		/*    Instructions    */
		/**********************/
		
		for (int cpt = 1; cpt < tab.length; cpt++)
		{
			if (tab[cpt - 1] > tab[cpt])
			{
				return false;
			}
		}
		
		return true;
	
	}
	
	public static int[] genererTableau(int nbCase, int min, int max)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		int[] tab = new int[nbCase];
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		for (int cpt = 0; cpt < tab.length; cpt++)
			tab[cpt] = (int)(Math.random() * (max - min + 1) + min);
		
		return tab;
	}
	
	public static int[] copierTableau(int[] tabEntre)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		int[] tabRetour;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		tabRetour = new int[tabEntre.length];

		for (int cpt = 0; cpt < tabEntre.length; cpt++)
			tabRetour[cpt] = tabEntre[cpt];

		return tabRetour;
	
	}
	
	public static String toString(int[] tab)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		String res;
		
		int cptr;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		res = "";
		
		cptr = 4;
		
		for (int cpt = 0; cpt < 9; cpt++)
		{
			if (cpt == 4)
			{
				res += "+ . . . . ";
			} else
			{
				res += "+--------";
			}
		}
		
		res += "+\n";
		
		for (int cpt = 0; cpt < 9; cpt++)
		{
			if (cpt < 4)
			{
				res += String.format("|%8d", tab[cpt]);
			}
			
			if (cpt == 4)
			{
				res += "|         ";
			}
			
			if (cpt > 4)
			{
				res += String.format("|%8d", tab[ tab.length - cptr ]);
				
				cptr--;
			}
		
		}
		
		res += "|\n";
		
		for (int cpt = 0; cpt < 9; cpt++)
		{
			if (cpt == 4)
			{
				res += "+ . . . . ";
			} 
			else
			{
				res += "+--------";
			}
		
		}
		
		res += "+\n";
		
		cptr = 4;
		
		for (int cpt = 0; cpt < 9; cpt++)
		{
		
			if (cpt < 4)
			{
				res += String.format("%9d", cpt);
			}

			if (cpt == 4)
			{
				res += "          ";
			}
			
			if (cpt > 4)
			{
				res += String.format("%9d", tab.length - cptr);
				cptr--;
			}
		
		}
		return res;
	}
	
	private static void permuter(int[] tab, int ind1, int ind2)
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		int temp;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		if ( tab[ind1] != tab[ind2] )
		{
			temp = tab[ind1];
			tab[ind1] = tab[ind2];
			tab[ind2] = temp;
		}
	
	}

}
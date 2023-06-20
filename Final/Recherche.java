import java.util.Arrays;

public class Recherche
{

	public static void trier ( String[] tabMot )
	{
		/*******************/
		/*    Variables    */
		/*******************/
		
		int max;
		int nbEl;
		String mem;
		
		/**********************/
		/*    Instructions    */
		/**********************/
		
		max  = 0;
		
		nbEl = tabMot.length - 1;
		
		while (nbEl > 0)
		{
		
			max = 0;
			
			for (int cpt=0; cpt <= nbEl; cpt++)
			{
			
				if (tabMot[cpt].compareTo(tabMot[max]) > 0) { max = cpt; }
			
			}
			
			mem          = tabMot[max]  ; 
			tabMot[max]  = tabMot[nbEl] ;
			tabMot[nbEl] = mem          ;
			
			nbEl--;
		
		}
		
	
	}

	public static int rechSequentielle ( String motRch, String[] tabMot  )
	{
		for (int cpt = 0; cpt < tabMot.length; cpt++) // on défile le tableau
		{
			if (tabMot[cpt].compareTo(motRch) == 0) { return cpt; } // on regarde si la valeur est la meme et on la retourne si c'est le cas
		}
		return -1;
	}

	public static int rechDichotomique ( String motRch, String[] tabMot  )
	{
		int iPetit  ; //borne minimal de recherche
		int iGrand  ; //borne maximal de recherche
		int iActuel ; //valeur a comparer
		
		
		iPetit  = 0                                ;
		iGrand  = tabMot.length                    ;
		iActuel = ((iGrand - iPetit) / 2) + iPetit ;
		while ( iActuel != iGrand )
		{
			if ( tabMot[iActuel].compareTo(motRch) == 0 ) { return       iActuel; }
			if ( tabMot[iActuel].compareTo(motRch)  > 0 ) { iGrand = iActuel; }
			else                                          { iPetit = iActuel; }
			iActuel = ((iGrand - iPetit) / 2) + iPetit ;
		}
		return -1;
	}


	public static int rechRec ( String motRch, String[] tabMot )
	{
		return rechRec ( motRch, tabMot, 0, tabMot.length - 1 );
	}




	private static int rechRec ( String motRch, String[] tabMot, int deb, int fin)
	{
		int milieu;

		if ( tabMot[deb].equals (motRch) ) return deb;
		if ( tabMot[fin].equals (motRch) ) return fin;

		if ( fin - deb > 1 )
		{
			milieu = (fin+deb)/2;

			
			if ( tabMot[milieu].compareTo ( motRch ) >  0 ) return Recherche.rechRec ( motRch, tabMot, deb,      milieu-1 );
			if ( tabMot[milieu].compareTo ( motRch ) <  0 ) return Recherche.rechRec ( motRch, tabMot, milieu+1, fin      );
			if ( tabMot[milieu].compareTo ( motRch ) == 0 ) return milieu;
		}

		return -1;
		

	}
	


	public static String[] genererMots(int nbMots)
	{
		String[] tabRet = new String[nbMots];

		for (int cpt=0; cpt< tabRet.length;cpt++)
		{
			tabRet[cpt] = "" + Recherche.lettre() + Recherche.lettre();
		}
		
		return tabRet;
	}

	private static char lettre ()
	{
		return (char) ( 'A' + (int) (Math.random() * 26) );
	}

}

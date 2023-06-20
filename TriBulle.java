/** Tri Bulle
  * @author GOUREAU Tom
  * date : 09/11/2022
  */

public class TriBulle
{
	public static void main(String[] a)
	{
		/*----------------------*/
		/*  Données             */
		/*----------------------*/

		int[]   tab     ;
		int     temp    ;
		boolean echange ;

		/*----------------------*/
		/*  Instructions        */
		/*----------------------*/
		tab = new int[] {9,8,7,6,5,4,3,2,1} ; // {1,2,3,4,5,6,7,8,9}
		echange = true ;

		/* on continue de trié tant qu'il y a des echanges */
		while (echange)
		{
			echange = false ; /* au début d'un tour, il n'y a pas eu d'échange */
			for (int cpt = 1; cpt < tab.length; cpt++)
			{
				if (tab[cpt] < tab[cpt-1])
				{
					/* on échange la valeur max avec la valeur de tab[cpt] */
					temp       = tab[cpt]   ;
					tab[cpt]   = tab[cpt-1] ;
					tab[cpt-1] = temp       ;
					/* on confirme qu'il y a eu un echange */
					echange = true ;
				}
			}
		}

		String res = "";
		for (int cpt = 0; cpt < tab.length; cpt++)
		{
			res += tab[cpt] + "|";
		}
		System.out.print(res);


	


	}

}
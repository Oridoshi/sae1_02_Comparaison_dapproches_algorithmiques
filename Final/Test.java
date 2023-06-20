public class Test
{
	public static void main(String[] a)
	{
			/*******************/
			/*    Variables    */
			/*******************/

			final int NB_VALEURS = 1000;
			String[] tabMot;
			String   motRec;
			
			long debut, fin ;
			int  recDich, recSequ;
			long tpsDich, tpsSequ;

			/**********************/
			/*    Instructions    */
			/**********************/
			
			// Etape 1
			tabMot = Recherche.genererMots(NB_VALEURS);
			
			// Etape 2
			Recherche.trier ( tabMot );

			//Etape 3
			motRec = Recherche.genererMots(1)[0];

			/* A compléter */
			debut = System.nanoTime();
			recSequ = Recherche.rechSequentielle ( motRec , tabMot );
			fin   = System.nanoTime();
			tpsSequ = fin - debut    ;
			
			debut = System.nanoTime();
			recDich = Recherche.rechDichotomique ( motRec , tabMot );
			fin   = System.nanoTime();
			tpsDich = fin - debut    ;
			
			System.out.println ("Les recherches doivent trouver : " + motRec + " sur une plage de " + NB_VALEURS + " valeurs");
			System.out.println ("La recherche séquentielle a trouvée " + tabMot[recSequ] + " en " + tpsSequ);
			System.out.println ("La recherche dichotomique a trouvée " + tabMot[recDich] + " en " + tpsDich);
			



	}

}

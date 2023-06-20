public class testTri
{
	public static void main(String[] a)
	{
		/*-----------------*/
		/* Variables       */
		/*-----------------*/

		int[] tab        ;
		int[] copTab     ;

		long  debut, fin ;

		int   temp       ;

		int   ind1,ind2  ;

		/*-----------------*/
		/* Instructions    */
		/*-----------------*/
		
		System.out.println("\n----------Tableau Aléatoire----------\n");

		//tableauAléatoire

		tab = TriUtil.genererTableau(50000, 0, 99); // crée un tableau aléatoire
	
		//tri à bulle

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierBulle(copTab);
		fin = System.nanoTime();

		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri à bulle ( table aléatoire ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri à bulle )");

		//tri Insertion <3

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierInsertion(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Insertion ( table aléatoire ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Insertion )");

		//tri Selection

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierSelection(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Selection ( table aléatoire ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Selection )");


		System.out.println("\n----------Tableau Ranger----------\n");


		//Tableau Ranger

		TriUtil.trierInsertion(tab); // tir le tableau

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierBulle(copTab);
		fin = System.nanoTime();

		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri à bulle ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri à bulle )");

		//tri Insertion <3

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierInsertion(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Insertion ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Insertion )");

		//tri Selection

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierSelection(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Selection ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Selection )");
		

		System.out.println("\n----------Tableau inverser----------\n");

		//Tableau inverser

		for(int cpt = 0; cpt < tab.length/2; cpt++) // inverse le tableau ranger
		{
			temp         = tab[cpt]    ;
			tab[cpt]     = tab[tab.length - cpt - 1];
			tab[tab.length - cpt - 1] = temp;
		}

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierBulle(copTab);
		fin = System.nanoTime();

		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri à bulle ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri à bulle )");

		//tri Insertion <3

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierInsertion(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Insertion ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Insertion )");

		//tri Selection

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierSelection(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Selection ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Selection )");


		System.out.println("\n----------Tableau presque ranger----------\n");


		//Tableau presque ranger

		TriUtil.trierInsertion(tab); // tir le tableau

		for(int cpt = 0; cpt < 100; cpt++) // met un peut de désordre dans un tableau ranger
		{
			ind1 = (int) (Math.random() * tab.length);
			ind2 = (int) (Math.random() * tab.length);
			temp = tab[ind1];
			tab[ind1] = tab[ind2];
			tab[ind2] = temp;
		}

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierBulle(copTab);
		fin = System.nanoTime();

		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri à bulle ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri à bulle )");

		//tri Insertion <3

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierInsertion(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Insertion ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Insertion )");


		//tri Selection

		copTab = TriUtil.copierTableau(tab); 

		debut = System.nanoTime();
		TriUtil.trierSelection(copTab);
		fin = System.nanoTime();
		
		System.out.println(TriUtil.toString(copTab));
		if (TriUtil.estTrie(copTab))
			System.out.println("Temps d'éxécution du tri Selection ( table ranger ): " + (fin - debut));
		else
			System.out.println("votre tableau n'est pas trié ( tri Selection )");
	}
}
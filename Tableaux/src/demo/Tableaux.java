package demo;
class Tableaux {
    public static void main(String args[]) {
        // Construction d'un tableau:
        int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
        // Opérations sur le tableau:
        tableaux(tab);
 
        // La même chose pour d'autres tableaux:
        int[] tab1 = remplir1(5);
        tableaux(tab1);
 
        int[] tab2 = remplir2(10);
        tableaux(tab2);
 
        int[] tab3 = remplir3(5);
        tableaux(tab3);
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant de 0 à nb-1.
     * @param nb
     * @return
     */
    static int[] remplir1(int nb) {
        int[] tab = new int[nb];
     // A compléter
 
        for(int i =0;i<tab.length;i++) {
        	tab[i] =i;
        }
        
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre croissant à partir de 5.
     * @param nb
     * @return
     */
    static int[] remplir2(int nb) {
        int[] tab = new int[nb];
        // A compléter
        
        for(int i =0;i<nb;i++) {
        	tab[i] = i+5;
        }
        return tab;
    }
 
    /**
     * Cette méthode retourne un tableau int[] de nb éléments
     * initialisés en ordre décroissant de nb à 1.
     * @param nb
     * @return
     */
    static int[] remplir3(int nb) {
        int[] tab = new int[nb];
        // A compléter
        
        for(int i =0 ;i<tab.length;i++) {
        	tab[i] = nb-i;   //tab.length-i ; this works too 
        }
        return tab;
    }
 
    static void tableaux(int[] tab) {
        afficher(tab);
        operation1(tab);
        operation2(tab);
        operation3(tab);
        operation4(tab);
        operation5(tab);
    }
 
    /**
     * Cette méthode affiche tous les éléments du tableau reçu en
     * paramètre sur une même ligne. Les éléments sont séparés par
     * deux espaces.
     * @param tab
     */
    static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print("  "+tab[i]);
            //System.out.println(Arrays.toString(tab)+"\n"); // un autre facone de le faire aussi
        }
        System.out.println();    // Saut de ligne à la fin de l'affichage
    }
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments de valeur
     * 9 dans le tableau. La variable nb sert à compter les éléments
     * trouvés. Elle est initialisée à 0 et incrémentée dans la boucle
     * qui parcourt le tableau chaque fois que l'on trouve un 9.
     * @param tab
     */
    static void operation1(int[] tab) {
        int nb = 0;
     // A compléter
        
        for(int i =0;i<tab.length;i++) {
        	if(tab[i]==9) {
        		nb++;
        	}
        }
        
        

    
         System.out.println("Il y a " + nb + " éléments de valeur 9 dans le tableau");
    }
 
    /**
     * Cette méthode calcule et affiche le nombre d'éléments qui sont
     * plus grand que 4 OU plus petit que 2.
     * @param tab
     */
    static void operation2(int[] tab) {
        // A compléter
    	int c=0;
    	for(int i=0;i<tab.length;i++) {
    		if(tab[i] > 4|| tab[i] < 2) {
    			c++;
    		}
    	}
    	System.out.println("nombre plus grand que 4 ou plus petit que 2 "+c);
    }
    
 
    /**
     * Cette méthode calcule et affiche le somme de tous les éléments du tableau.
     * @param tab
     */
    static void operation3(int[] tab) {
        // A compléter
    	int sum=0;
    	for(int i=0;i<tab.length;i++) {
    		sum+=tab[i];
    	}
    	System.out.println("le sum est :"+sum);
    }
 
    /**
     * Cette méthode calcule et affiche la moyenne arithmétique de
     * tous les éléments du tableau.
     * @param tab
     */
    static void operation4(int[] tab) {
        // A compléter
    	double moyenne=0.0 ,sum=0;
    	
    	for(int i=0;i<tab.length;i++) {
    		sum+=tab[i];
    		moyenne+=sum/tab.length;
    	}
    	
    	System.out.println("le moyenne est :"+moyenne);
    	
    }
 
    /**
     * Cette méthode calcule et affiche le plus grand élément du tableau.
     * @param tab
     */
    static void operation5(int[] tab) {
        // A compléter
    	int grand = tab[0];
    	for(int i=0;i<tab.length;i++) {
    		if(tab[i] > grand) {
    			grand=tab[i];
    		}
    	}
    	
    	System.out.println("le plus grand est :"+grand);
    }
}
package demo;

public  class Animals {
		// propriété de la classe
		private static int totalNumber = 0;
		// propriétés de l'objet
	    protected String nom;
	    private int nombreDePatte;
	    
	    // cAnimalscteur
		public Animals(String nom, int nombreDePatte) {
			super();
			this.nom = nom;
			this.nombreDePatte = nombreDePatte;
			totalNumber++;
			
		}
 
		  private String formulerMonNom() {
	          return "Je m'appelle " + this.nom; 
	  }
	 
	      public void parler() {
	              System.out.println(this.formulerMonNom());  
	              System.out.println("Je suis un animal et j'ai " + this.nombreDePatte + " pattes");
	      }
	      // une methode de la classe
	      public static void afficherNombreDAnimaux() {
	              System.out.println("**************************");
	              System.out.println("Il y a " + totalNumber + " animaux");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated methodAnimals		
        Animals AnimalslTiti = new Animals("titi", 2);  
        AnimalslTiti.parler(); 
        Animals AnimalslMinet = new Animals("Gros minet", 4);  
        AnimalslMinet.parler(); 
        Animals.afficherNombreDAnimaux();  

	}

}

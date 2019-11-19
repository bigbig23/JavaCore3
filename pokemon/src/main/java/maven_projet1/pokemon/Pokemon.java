package maven_projet1.pokemon;



public class Pokemon {
	
	private String nom;
	private int nobreVie;
	
	
	private static int nobrPokemon;
	public Pokemon(String nom, int nobreVie) {
		this.nom = nom;
		this.nobreVie = nobreVie;
		nobrPokemon++;
	}
	
	public static void nomPks() {
		System.out.println("il y a : "+nobrPokemon+"Pokemons");
	}
	
	public Pokemon(int nobreVie) {
		this.nobreVie = nobreVie;
	}
	
	public void affiche() {
		
	}
	
	public void  battle(Pokemon p) {
		if(this.nobreVie > p.nobreVie) {
			System.out.println("je suis plus fort que " + nom);
		}else if(this.nobreVie < p.nobreVie) {
			System.out.println("je suis moind fort que " + nom);
		}else {
			System.out.println("je suis au meme niveau que " + nom);
		}	
	}
	
	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", nobreVie=" + nobreVie + "]";
	}
	
	

}

package demo;

public class Ville {

	protected String ville ;
	protected int nbreD ;
 
	
	public Ville()
	{
	
	}
	
	public Ville(String ville,int nbreD) {
		super();
 
		this.nbreD = nbreD;
		this.ville = ville;
	}
	
	
	
	
	public Ville(String ville) {
		super();
		this.ville = ville;
	}

		
	

	public String  presentToi() {
		String h ;
		String m;
		if(nbreD >0) {
			h = " "+nbreD;
			m = "ville " +this.ville +"nombre d'habitants "+h;
		}else {
			h = "incoun";
			m = "ville " + this.ville + "nombre d'habitants " +h;
			
		}
		
		return m;
		 	
		
	}
	


	
	
	
	
	
	
	

}

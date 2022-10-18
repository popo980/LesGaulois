package personnage;


public class Romain  { 
	private String nom; 
	private int force; 
	
	public Romain(String nom, int force) { 
		
		this.nom = nom; 
		this.force = force; 
		
		assert force > 0 : "force inferieur negative";
	} 
	
	public String getNom() { 
		return nom; 
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + '"' + texte + '"'); 
	} 
	
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	} 
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "force inferieur negative";
		int forceDebut = force;
		force -= forceCoup; 
		if (force > 0) { 
			this.parler("Aie"); 
		} else { 
			this.parler("J'abandonne..."); 
		} 
		assert forceDebut > force : "force la force n'a pas diminué en prenant un coup";
	} 
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.prendreParole();
		minus.parler("test");
		minus.recevoirCoup(5);
		
	}
} 
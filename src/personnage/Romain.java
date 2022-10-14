package personnage;


public class Romain  { 
	private String nom; 
	private int force; 
	public Romain(String nom, int force) { 
		this.nom = nom; 
		this.force = force; 
	} 
	
	public String getNom() { 
		return nom; 
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "« " + texte + "»"); 
	} 
	
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	} 
	
	public void recevoirCoup(int forceCoup) { 
		force -= forceCoup; 
		if (force > 0) { 
			this.parler("Aïe"); 
		} else { 
			this.parler("J'abandonne..."); 
		} 
	} 
	
	public static void main(String[] args) {
		Romain philipus = new Romain("philipus", 3);
		philipus.prendreParole();
		philipus.parler("test");
		philipus.recevoirCoup(5);
		
	}
} 
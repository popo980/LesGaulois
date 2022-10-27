package personnage;
import lieu.Village;

public class Chef { 
	private String nom;
	private int force; 
	private int effetPotion = 1; 
	private Village village; 
	
	public Chef(String nom, int force) {
		this.nom = nom;
		this.force = force; 
	} 
	

	public void setVillage(Village village){
		this.village = village;
	}
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() { 
		return "Le chef"+getNom()+ "du village " + village.getNom()+":"; 
	} 
	public void parler(String texte) { 
		System.out.println(prendreParole() + '"' + texte + '"'); 
	} 
	
	public void frapper(Romain romain) { 
		System.out.println(nom  +  "  envoie  un  grand  coup  dans  la  machoire  de  "  + 
				romain.getNom()); 
		romain.recevoirCoup(force / 3); 
	} 
	
}
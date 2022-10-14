package lieu;
import personnage.Chef;

public class Village {
	public String nom;
	public Chef chef;
	
	
	public Village(String nom) {
		this.nom = nom;
		this.chef = chef;
	}
	
	public void setChef(Chef chef){
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
}

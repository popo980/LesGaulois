package lieu;
import personnage.Chef;

public class Village {
	public String nom;
	public Chef chef;
	public int nbVillageois;
	public int nbVillageoisMax;
	public String[] villageois;
	
	
	public Village(String nom, Chef chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.nbVillageois = 0;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new String[nbVillageoisMax];
	}
	
	public void setChef(Chef chef){
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
}

package lieu;
import personnage.Chef;
import personnage.Gaulois;

public class Village {
	public String nom;
	public Chef chef;
	public int nbVillageois;
	public int nbVillageoisMax;
	public String[] villageois;
	
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new String[nbVillageoisMax];
	}
	
	public void ajouter_habitant(Gaulois gaulois){
		nbVillageois ++;
		villageois[nbVillageois] = gaulois.getNom();
	}

	public String trouver_habitant(int num_hab){
		return villageois[num_hab];
	}

	public void setChef(Chef chef){
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village_des_irreductibles = new Village("Village des irreductibles", 30);
		village_des_irreductibles.trouver_habitant(30);

	}
}

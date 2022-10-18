package lieu;
import personnage.Chef;
import personnage.Gaulois;

public class Village {
	public String nom;
	public Chef chef;
	public int nbVillageois;
	public int nbVillageoisMax;
	public Gaulois[] villageois;
	
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	
	public void ajouter_habitant(Gaulois gaulois){
		villageois[nbVillageois] = gaulois;
		nbVillageois ++;
	}

	public Gaulois trouver_habitant(int num_hab){
		return villageois[num_hab];
	}

	public void setChef(Chef chef){
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void afficher_villageois(){
		System.out.println("Dans "+ this.getNom()+ " du chef "+ this.chef.getNom()
				+" vivent les legendaires gaulois :");
		
		for (int i=0; i != nbVillageois; i++) {
			System.out.println("- "+ this.trouver_habitant(i).getNom());
		}
		
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irreductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("asterix", 8);
		village.ajouter_habitant(asterix);
		Gaulois obelix  = new Gaulois("obelix", 25);
		village.ajouter_habitant(obelix);
		village.afficher_villageois();
		
		
		
		
		
		//Gaulois gaulois = village.trouver_habitant(1);
		//System.out.println(gaulois);
		//l'erreur viens car l'emplacement est vide, asterix est en 0 pas en 1

		//village.trouver_habitant(30);
		//le village n'est pas asser grand, on essaie de prendre une valeur a une position inexistance
	}

}

package personnage;
import java.util.Random;

public class Druide { 
	private String nom;
	private int effetPotionMin; 
	private int effetPotionMax; 
	private int forcePotion =1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) { 
		this.nom = nom;
		this.effetPotionMin = effetPotionMin; 
		this.effetPotionMax = effetPotionMax; 
		this.parler("Bonjour,  je  suis  le  druide  "  +  nom  +  
				"  et  ma  potion  peut  aller d'une force " + effetPotionMin + " e " 
				+ effetPotionMax + "."); 
	} 
	
	public void preparerPotion () {
		Random test = new Random();
		int effetPotion = this.effetPotionMin-1;
		while (effetPotion< this.effetPotionMin) {
			effetPotion = test.nextInt(this.effetPotionMax+1);
		}
		this.forcePotion = effetPotion;
		if (this.forcePotion > 7) {
			this.parler(" J'ai  prepare une super potion de force " + this.forcePotion);
		} else {
			this.parler("Je  n'ai  pas  trouve  tous  les  ingredients,  ma  potion  est seulement de force "+ this.forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obelix") {
			this.parler("Non, Obelix !... Tu n'auras pas de potion magique");
		}else {
			gaulois.boirePotion(this.forcePotion);
		}
	}
	
	private String getNom() {
		return nom;
	}
	
	public String prendreParole() { 
		return "Le druide " + getNom()+":";
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + '"' + texte + '"'); 
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}
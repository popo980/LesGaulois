package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	//__________________________________________________________________
	private int nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	//__________________________________________________________________
	
	
	public Gaulois(String nom, int force) {
		this.nom  = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + '"' + texte + '"');
	}
	
//	private String prendreParole() {
//		return "Le gaulois "+ nom +":";
//	}
//________________________________________________________________________________
//________________________________________________________________________________

	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}	
	
//________________________________________________________________________________
//________________________________________________________________________________
//	public void frapper(Romain romain) { 
//		System.out.println(nom + " envoie un grand coup dans la machoire de " 
//				+ romain.getNom());
//		romain.recevoirCoup((force / 3)*this.effetPotion); 
//	} 
//________________________________________________________________________________
//________________________________________________________________________________

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans lamâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
			}
		return;
		}
//________________________________________________________________________________
//________________________________________________________________________________
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+ this.effetPotion + " decuplee !");
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("test");
		Romain philipas = new Romain("philipas", 3);
		asterix.frapper(philipas);
	}
} 
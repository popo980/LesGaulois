package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
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
	
	private String prendreParole() {
		return "Le gaulois "+ nom +":";
	}

	public void frapper(Romain romain) { 
		System.out.println(nom + " envoie un grand coup dans la machoire de " 
				+ romain.getNom());
		romain.recevoirCoup((force / 3)*this.effetPotion); 
	} 
	
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
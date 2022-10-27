package personnage;

import lieu.Musee;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	//__________________________________________________________________
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
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
		return "Le gaulois " + nom + " : ";
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
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] equipementEjecte = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; equipementEjecte != null && i < equipementEjecte.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = equipementEjecte[i];
			}
		}
//________________________________________________________________________________
//________________________________________________________________________________
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+ this.effetPotion + " decuplee !");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	public void faireUneDonnation(Musee musee) {
		if (nbTrophees > 0) {
			String texte = "je donne au musee tout mes trophees :";
			for (int i=0; i<nbTrophees; i++) {
				musee.donnerTrophees(this, trophees[i]);
				texte += "\n- "+trophees[i];
				trophees[i] = null;
			}
			nbTrophees = 0;
			parler(texte);
		}
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("test");
		Romain philipas = new Romain("philipas", 3, false);
		asterix.frapper(philipas);
	}
} 
package histoire;

import personnage.Druide;
import personnage.Equipement;
import personnage.Gaulois;
import personnage.Romain;
import lieu.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6, false);
		Romain milexcus = new Romain("Milexcus", 8, false);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		System.out.println('\n');
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0 && !(minus.getAbandonG()));
		System.out.println("\n");
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0 && !(milexcus.getAbandonG()));
		
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);

	}

}
//____________________________________________________________________________________________
// scenraio fais mains

//package histoire;
//import personnage.Gaulois;
//import personnage.Romain;
//import personnage.Druide;
//
//public class Scenario {
//
//	public static void main(String[] args) {
//		Gaulois asterix = new Gaulois("Asterix", 3);
//		Gaulois obelix = new Gaulois("Obelix", 1000);
//		Romain minus = new Romain("Minus", 15);
//		Druide panoramix = new Druide("Panoramix", 5, 10);
//		
//		panoramix.parler("je vais aller preparer une petite potion...");
//		panoramix.preparerPotion();
//		panoramix.booster(obelix);
//		obelix.parler("par nelos, ce n'est pas juste");
//		panoramix.booster(asterix);
//		asterix.parler("Bonjour");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//	}
//
//}

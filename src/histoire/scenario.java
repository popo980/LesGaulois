package histoire;
import personnage.Gaulois;
import personnage.Romain;
import personnage.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 3);
		Gaulois obelix = new Gaulois("Ob�lix", 1000);
		Romain minus = new Romain("Minus", 15);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.parler("je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("par B�n�los, ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}

package lieu;
import personnage.Trophee;
import personnage.Gaulois;
import personnage.Equipement;


public class Musee {
	private Trophee[] collection;
	private int nbTrophee=0;
	public Musee() {
		this.collection = new Trophee[200];
		this.nbTrophee=0;
	}
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee();
		trophee.setEquipement(equipement);
		trophee.setGaulois(gaulois);
		if (nbTrophee < 200) {
			this.collection[nbTrophee] = trophee;
			nbTrophee++;
		}else {
			System.out.println("le musee est pleins");
		}
	}
	
	public String extraireInstructionCaml() {
		String texte = "let musee = [";
		
		for (int i=0; i<nbTrophee; i++) {
			texte+= "\n"+'"'+ collection[i].donnerNom() +'"'+", "
		+'"'+collection[i].getEquipement()+'"'+";";
		}
		
		return texte;
	}

}

package personnage;


public class Romain  { 
	private String nom; 
	private int force; 
	private Equipement[] equipement;
	private int nbEquipement;
	
	public Romain(String nom, int force) { 
		
		this.nom = nom; 
		this.force = force; 
		this.equipement = new Equipement[2];
		this.nbEquipement = 0;
		
		assert force > 0 : "force inferieur negative";
	} 
	
	public String getNom() { 
		return nom; 
	} 
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + '"' + texte + '"'); 
	} 
	
	private String prendreParole() { 
		return "Le romain " + nom + " : "; 
	} 
	
	public void sEquiper(Equipement armure) {
		
		switch (nbEquipement) {
			case 2: {
				System.out.println("Le soldat "+ this.nom+ " est deja bien protege !");
				break ;
			}
			case 1: {
				if (this.equipement[0] == armure) {
					System.out.println("Le soldat " + this.nom+ " possede deja un "+ armure);
				}else {
					this.equiperEquipement(armure);
				}
				break;
			}
			default:
				this.equiperEquipement(armure);
		}
	}
	
	private void equiperEquipement(Equipement armure) {
		System.out.println("Le soldat " + this.nom + " s'equipe avec un "+ armure);
		this.equipement[nbEquipement]=armure;
		nbEquipement++;
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "force inferieur negative";
		int forceDebut = force;
		force -= forceCoup; 
		if (force > 0) { 
			this.parler("Aie"); 
		} else { 
			this.parler("J'abandonne..."); 
		} 
		assert forceDebut > force : "force la force n'a pas diminué en prenant un coup";
	} 
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		//minus.prendreParole();
		//minus.parler("test");
		//minus.recevoirCoup(5);
		//System.out.println(Equipement.BOUCIER + " // "+ Equipement.CASQUE);
		
	}
} 
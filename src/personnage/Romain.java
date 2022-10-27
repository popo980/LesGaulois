package personnage;


public class Romain  { 
	private String nom; 
	private int force; 
	private Equipement[] equipements;
	private int nbEquipement;
	private boolean abandonG;
	public Romain(String nom, int force, boolean abandonG) { 
		this.abandonG = abandonG;
		this.nom = nom; 
		this.force = force; 
		this.equipements = new Equipement[2];
		this.nbEquipement = 0;
		
		assert force > 0 : "force inferieur negative";
	} 
	
	public int getForce() {
		return force;
	}
	
	public boolean getAbandonG() {
		return abandonG;
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
		String presentation = "Le soldat "+ this.nom;
		switch (nbEquipement) {
			case 2: {
				System.out.println(presentation + " est deja bien protege !");
				break ;
			}
			case 1: {
				if (this.equipements[0] == armure) {
					System.out.println(presentation + " possede deja un "+ armure);
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
		this.equipements[nbEquipement]=armure;
		nbEquipement++;
	}
	
//____________________________________________________________________________
//____________________________________________________________________________
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		if (forceCoup>=0) {
			force -= forceCoup;
		} else {
			parler("Ton coup est trop faible Gaulois !");
			abandonG= true;
		}
		
		if (force > 0 && !(abandonG)) {
			parler("Aïe");
		} else if (!(abandonG)){
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force ducoup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
					for (int i = 0; i < nbEquipement;i++) {
						if ((equipements[i] != null && 
								equipements[i].equals(Equipement.BOUCLIER))) {
							resistanceEquipement += 8;
						} else if (equipements[i] != null) {
							resistanceEquipement += 5;
						}
					}
					texte += resistanceEquipement + "!";
				}
				parler(texte);
				forceCoup -= resistanceEquipement;
				return forceCoup;
			}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}
	
//______________________________________________________________________________
//______________________________________________________________________________
	
//	public void recevoirCoup(int forceCoup) {
//		assert force > 0 : "force inferieur negative";
//		int forceDebut = force;
//		force -= forceCoup; 
//		if (force > 0) { 
//			this.parler("Aie"); 
//		} else { 
//			this.parler("J'abandonne..."); 
//		} 
//		assert forceDebut > force : "force la force n'a pas diminué en prenant un coup";
//	} 
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6, false);
		
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
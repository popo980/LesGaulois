package personnage;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee() {
		
	}
	
	public Equipement getEquipement() {
		return equipement;
	}
	public Gaulois getGaulois() {
		return gaulois;
	}
	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	public void setGaulois(Gaulois gaulois) {
		this.gaulois = gaulois;
	}
	public String donnerNom() {
		return this.gaulois.getNom();
	}
}

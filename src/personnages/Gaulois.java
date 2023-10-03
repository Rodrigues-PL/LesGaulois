package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler(" Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e si la force de la potion est de " + effetPotion);
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Druide Panoramix = new Druide("Panoramix",5,10);
		int pot = Panoramix.preparerPotion();
		asterix.boirePotion(pot);
		Romain romain1 = new Romain("sinus",4);
		asterix.frapper(romain1);
		asterix.parler("ouais");
	}
}

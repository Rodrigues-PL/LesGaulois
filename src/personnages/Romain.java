package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
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
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			 parler("Aie");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[] args) {
		Romain romain1 = new Romain("sinus",4);
		romain1.parler("Halte");
		romain1.recevoirCoup(3);
	}
}

package personnages;

import java.util.Arrays;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom) {
		this.nom = nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois +1;
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
			return villageois[numeroVillageois];
	}
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village du chef " + village.chef + "vivent les légendaires gaulois :");
		int i = 0;
		while (i < nbVillageois) {
			System.out.println("- " + village.villageois[i].getNom());
			i++;
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// on cherche le villageois 30 alors qu'il n'y a pas de villageois
		Chef Abraracourcix = new Chef("Abraracourcix",6,1,village);
		village.chef = Abraracourcix;
		Gaulois Asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(Asterix);
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois); 
		null car il y a un villageois à l'emplacement 0 hors on demande pour l'emplacement 1 */
		Gaulois Obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois(village);
	}

}

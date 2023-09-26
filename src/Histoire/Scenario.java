package Histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",5,10);
		Gaulois Obelix = new Gaulois("Obelix",25);
		Gaulois Asterix = new Gaulois("Asterix",8);
		Romain Minus = new Romain("Minus",6);
		Panoramix.parler("Je vais aller préparer une potion..");
		int Potion = Panoramix.preparerPotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par Bélénos, ce n'est pas juste !");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour");
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
	}

}

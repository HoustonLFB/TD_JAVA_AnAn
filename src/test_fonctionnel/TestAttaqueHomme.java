package test_fonctionnel;

import affrontement.Bataille;
import armes.Arc;
import armes.Epee;
import armes.LancePierre;
import protagonistes.Dragon;
import protagonistes.Heros;
import protagonistes.Homme;

public class TestAttaqueHomme {
	public static void main(String[] args) {
		Heros arthur = new Heros("Arthur");
		Homme thomas = new Homme("Thomas");
		Homme jacques = new Homme("Jacques");
		Dragon dragonNoir = new Dragon("Dragon noir");

		Epee excalibur = new Epee("excalibur");
		Arc arc = new Arc(1);
		LancePierre lancePierre = new LancePierre();

		Bataille bataille = new Bataille();

		arthur.rejointBataille(bataille);
		thomas.rejointBataille(bataille);
		jacques.rejointBataille(bataille);
		dragonNoir.rejointBataille(bataille);

		System.out.print(jacques.combattre(dragonNoir));
		System.out.print(arthur.prendre(excalibur));
		System.out.print(arthur.combattre(dragonNoir));
		System.out.print(thomas.prendre(excalibur));
		System.out.print(thomas.combattre(dragonNoir));
		System.out.print(thomas.lacher());
		System.out.print(thomas.prendre(lancePierre));
		System.out.print(arthur.prendre(arc));
		System.out.print(arthur.combattre(dragonNoir));
		System.out.print(arthur.combattre(dragonNoir));
		System.out.print(arthur.lacher());
		System.out.print(thomas.combattre(dragonNoir));
		System.out.print(dragonNoir.getVie());

		// RESULTAT ATTENDU
		// Jacques s’attaque sans aucune arme à Dragon noir.
		// C’est ainsi que le courageux Jacques mourut.
		// Le héros Arthur : Je prends mon épée.
		// Arthur attaque Dragon noir avec son épée.
		// Dragon noir subit une violente attaque, mais il parvient à se relever.
		// Thomas : Arthur peux-tu me laisser ton épée ?
		// Le héros Arthur : pas de souci, cela me permettra de reprendre mon souffle.
		// Arthur a lâché son épée.
		// Thomas : Je prends mon épée.
		// Thomas attaque Dragon noir avec son épée.
		// Dragon noir subit une violente attaque, mais il parvient à se relever.
		// Thomas a lâché son épée.
		// Thomas : Je prends mon lance-pierre.
		// Le héros Arthur : Je prends mon arc.
		// Arthur attaque Dragon noir avec son arc.
		// Dragon noir subit une violente attaque, mais il parvient à se relever.
		// Arthur attaque Dragon noir avec son arc.
		// Malheureusement il ne possédait plus de flèches.
		// Arthur a lâché son arc.
		// Thomas attaque Dragon noir avec son lance-pierre.
		// Dragon noir subit une violente attaque, trop violente pour survivre.
		// C’est ainsi que le dragon Dragon noir mourut.
		// Les Hommes ont conquis la lande, leurs villages n'auront plus jamais à
		// trembler devant les dragons.

	}
}

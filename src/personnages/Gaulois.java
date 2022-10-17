package personnages;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + texte);
	}
	
//	private String prendreParole() {
//		return "Le gaulois" + nom + " : ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois" + nom + " : ";
		return texte;
	}
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
								effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	
//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}
	
	public static void main(String[] args) {
		Gaulois asterix = Gaulois("Astérix",8);
		System.out.println(asterix);
		
	}
}

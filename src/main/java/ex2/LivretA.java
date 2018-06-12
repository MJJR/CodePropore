package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de r�mun�ration dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilis� pour cr�er un compte de type Livret A
	 * 
	 * @param type
	 *            = LA
	 * @param solde
	 *            repr�sente le solde du compte
	 * @param decouvert
	 *            repr�sente le d�couvert autoris�
	 * @param tauxRemuneration
	 *            repr�sente le taux de r�mun�ration du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {

		if (getSolde() - montant > 0) {
			setSolde(getSolde() - montant);
		}

	}

	/**
	 * Fonction : Applique une r�mun�ration annuelle
	 * 
	 */
	public void appliquerRemuAnnuelle() {

		setSolde(getSolde() + getSolde() * getTauxRemuneration() / 100);
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}

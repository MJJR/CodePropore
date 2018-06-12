package ex3;

import java.util.ArrayList;

/**
 * Classe Zone
 * 
 * @author matth
 *
 */
public class Zone {

	/**
	 * listeAnimaux : ArrayList<Animal>
	 */
	private ArrayList<Animal> listeAnimaux;

	/**
	 * nomZone : String
	 */
	private String nomZone;

	/**
	 * typeAccepte : TypeAnimal
	 */
	private TypeAnimal typeAccepte;

	/**
	 * comportementAccepte : TypeComportement
	 */
	private TypeComportement comportementAccepte;

	/**
	 * kgNourriture : double
	 */
	private double kgNourriture;

	/**
	 * @param typeVoulu
	 * @param comportementVoulu
	 */
	public Zone(String leNom, TypeAnimal typeVoulu, TypeComportement comportementVoulu, double kgNourriture) {
		this.nomZone = leNom;
		this.listeAnimaux = new ArrayList<Animal>();
		this.typeAccepte = typeVoulu;
		this.comportementAccepte = comportementVoulu;
		this.kgNourriture = kgNourriture;
	}

	/**
	 * Fonction : Verifie si un animal répond aus critères de la zone
	 * 
	 * @param animal
	 * @return
	 */
	public boolean verifierAnimal(Animal animal) {
		if (getComportementAccepte() != null) {
			return (animal.getType().equals(getTypeAccepte())
					&& animal.getComportement().equals(getComportementAccepte()));
		} else {
			return animal.getType().equals(getTypeAccepte());
		}

	}

	/**
	 * Fonction : Ajoute un animal dans la zone
	 * 
	 * @param animal
	 */
	public void ajouterAnimal(Animal animal) {
		getListeAnimaux().add(animal);
	}

	/**
	 * Fonction : Affiche la liste des animaux de la zone
	 * 
	 */
	public void afficherListeAnimaux() {
		System.out.println("---" + getNomZone() + "---\n");
		for (int i = 0; i < listeAnimaux.size(); i++) {
			System.out.println(listeAnimaux.get(i).getNom());
		}
		System.out.println("\n");
	}

	/**
	 * Fonction : Calcule le nombre de kilogramme de nourriture par jour à
	 * donner aux animaux de la zone
	 * 
	 * @return
	 */
	public double calculerKgsNourritureParJour() {
		return getListeAnimaux().size() * getKgNourriture();
	}

	/**
	 * Fonction :
	 * 
	 * @return
	 */
	public ArrayList<Animal> getListeAnimaux() {
		return listeAnimaux;
	}

	/**
	 * Fonction :
	 * 
	 * @param listeAnimaux
	 */
	public void setListeAnimaux(ArrayList<Animal> listeAnimaux) {
		this.listeAnimaux = listeAnimaux;
	}

	/**
	 * @return the typeAccepte
	 */
	public TypeAnimal getTypeAccepte() {
		return typeAccepte;
	}

	/**
	 * @param typeAccepte
	 *            the typeAccepte to set
	 */
	public void setTypeAccepte(TypeAnimal typeAccepte) {
		this.typeAccepte = typeAccepte;
	}

	/**
	 * @return the comportementAccepte
	 */
	public TypeComportement getComportementAccepte() {
		return comportementAccepte;
	}

	/**
	 * @param comportementAccepte
	 *            the comportementAccepte to set
	 */
	public void setComportementAccepte(TypeComportement comportementAccepte) {
		this.comportementAccepte = comportementAccepte;
	}

	/**
	 * @return the nomZone
	 */
	public String getNomZone() {
		return nomZone;
	}

	/**
	 * @param nomZone
	 *            the nomZone to set
	 */
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	/**
	 * @return the kgNourriture
	 */
	public double getKgNourriture() {
		return kgNourriture;
	}

	/**
	 * @param kgNourriture
	 *            the kgNourriture to set
	 */
	public void setKgNourriture(double kgNourriture) {
		this.kgNourriture = kgNourriture;
	}

}

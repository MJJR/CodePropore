package ex3;

import java.util.ArrayList;

/**
 * Classe Zoo
 * 
 * @author matth
 *
 */
public class Zoo {

	/**
	 * nom : String
	 */
	private String nom;

	/**
	 * zones : ArrayList<Zone>
	 */
	private ArrayList<Zone> zones;

	/**
	 * @param nom
	 */
	public Zoo(String nom) {
		this.nom = nom;

		this.zones = new ArrayList<Zone>();

	}

	/**
	 * Fonction : Ajoute un animal
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		for (int i = 0; i < getZones().size(); i++) {
			if (getZones().get(i).verifierAnimal(animal)) {
				getZones().get(i).ajouterAnimal(animal);
			}
		}
	}

	/**
	 * Fonction : affiche la liste des animaux de la zone
	 * 
	 */
	public void afficherListeAnimaux() {
		for (int i = 0; i < getZones().size(); i++) {
			getZones().get(i).afficherListeAnimaux();
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the zones
	 */
	public ArrayList<Zone> getZones() {
		return zones;
	}

	/**
	 * @param zones
	 *            the zones to set
	 */
	public void setZones(ArrayList<Zone> zones) {
		this.zones = zones;
	}

}

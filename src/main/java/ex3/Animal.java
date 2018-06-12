package ex3;

/**
 * Classe Animal
 * 
 * @author matth
 *
 */
public class Animal {

	/**
	 * nom : String
	 */
	private String nom;
	/**
	 * type : TypeAnimal
	 */
	private TypeAnimal type;
	/**
	 * comportement : TypeComportement
	 */
	private TypeComportement comportement;

	/**
	 * @param leNom
	 * @param leType
	 * @param leComportement
	 */
	public Animal(String leNom, TypeAnimal leType, TypeComportement leComportement) {
		this.nom = leNom;
		this.type = leType;
		this.comportement = leComportement;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the type
	 */
	public TypeAnimal getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeAnimal type) {
		this.type = type;
	}

	/**
	 * @return the comportement
	 */
	public TypeComportement getComportement() {
		return comportement;
	}

	/**
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(TypeComportement comportement) {
		this.comportement = comportement;
	}

}

package ex3;

/**
 * Executable
 * 
 * @author matth
 *
 */
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.getZones().add(new Zone("Savane Africaine", TypeAnimal.MAMMIFERE, TypeComportement.HERBIVORE, 10));
		zoo.getZones().add(new Zone("Zone Carnivore", TypeAnimal.MAMMIFERE, TypeComportement.CARNIVORE, 10));
		zoo.getZones().add(new Zone("Ferme Reptile", TypeAnimal.REPTILE, null, 0.1));
		zoo.getZones().add(new Zone("Aquarium", TypeAnimal.POISSON, null, 0.2));

		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE, TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, TypeComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.POISSON, TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, TypeComportement.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, TypeComportement.CARNIVORE));

		zoo.afficherListeAnimaux();
	}

}

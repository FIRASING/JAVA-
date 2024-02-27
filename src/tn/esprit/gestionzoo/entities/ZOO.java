package tn.esprit.gestionzoo.entities;

public class ZOO {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount;
    private int searchIndex;

    public ZOO(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages];
        animalCount = 0;
        searchIndex = -1;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull()) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animals in the Zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                searchIndex = i;
                return searchIndex;
            }
        }
        searchIndex = -1;
        return searchIndex;
    }

    public boolean isZooFull() {
        return animalCount == nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    // Classe pour les animaux aquatiques
    public static class Aquatic {
        protected String habitat;

        public Aquatic(String habitat) {
            this.habitat = habitat;
        }

        @Override
        public String toString() {
            return "Aquatic{" +
                    "habitat='" + habitat + '\'' +
                    '}';
        }
    }

    // Classe pour les dauphins
    public static class Dolphin extends Aquatic {
        protected float swimmingSpeed;

        public Dolphin(String habitat, float swimmingSpeed) {
            super(habitat);
            this.swimmingSpeed = swimmingSpeed;
        }

        @Override
        public String toString() {
            return "Dolphin{" +
                    "habitat='" + habitat + '\'' +
                    ", swimmingSpeed=" + swimmingSpeed +
                    '}';
        }
    }

    // Classe pour les pingouins
    public static class Penguin extends Aquatic {
        protected float swimmingDepth;

        public Penguin(String habitat, float swimmingDepth) {
            super(habitat);
            this.swimmingDepth = swimmingDepth;
        }

        @Override
        public String toString() {
            return "Penguin{" +
                    "habitat='" + habitat + '\'' +
                    ", swimmingDepth=" + swimmingDepth +
                    '}';
        }
    }

    // Classe pour les animaux terrestres
    public static class Terrestrial {
        protected int nbrLegs;

        public Terrestrial(int nbrLegs) {
            this.nbrLegs = nbrLegs;
        }

        @Override
        public String toString() {
            return "Terrestrial{" +
                    "nbrLegs=" + nbrLegs +
                    '}';
        }
    }

}
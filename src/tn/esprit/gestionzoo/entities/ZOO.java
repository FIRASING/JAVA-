package tn.esprit.gestionzoo.entities;

public class ZOO {
    private Animal[] animals;
    private aquatic[] aquatics;
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
    public boolean addAqauticAnimal(aquatic aquatic)
    {
        aquatics[] = animal;
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
    }}


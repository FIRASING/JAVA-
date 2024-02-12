package tn.esprit.gestionzoo.entities;

public class ZOO {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int animalCount;
    private int searchIndex;

    public ZOO(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.animalCount = 0;
        this.searchIndex = -1;
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

    public boolean addAnimal(Animal animal) {
        if (searchIndex == -1) {
            if (animalCount < nbrCages) {
                animals[animalCount] = animal;
                animalCount++;
                return true;
            }
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
            if (animals[i].getName()==animal.getName()) {
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

    public ZOO compareZoo(ZOO zoo1, ZOO zoo2) {
        if (zoo1.animalCount > zoo2.animalCount) {
            return zoo1;
        } else {
            return zoo2;
        }
    }
}
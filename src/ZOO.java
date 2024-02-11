public class ZOO {
    Animal[] animals;
    String name;
    String city;
    public static int nbrCages = 26;
    int k = 0;
    int i = 0;
    int index = 0;

    public ZOO(String name, String city, int nbrCages) {

        animals = new Animal[nbrCages];

        this.name = name;

        this.city = city;

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
        if (index == -1) {
            if (k < nbrCages) {
                animals[k] = animal;
                k++;
            }
            return true;
        } else {
            return false;
        }
    }

    public void displayAnimals() {
        System.out.println("Animals in the Zoo:");
        for (int i = 0; i < k; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < k; i++) {
            if (animals[i].name == animal.name) {
                index = i;
            } else {
                index = -1;
            }
        }
        return index;
    }

    boolean isZooFull() {
        if (animals.length == nbrCages) {
            return true;
        } else {
            return false;
        }
    }

    ZOO comparerZoo(ZOO z1, ZOO z2) {
        if (z1.animals.length > z2.animals.length) {
            return z1;
        } else {
            return z2;
        }
    }
}


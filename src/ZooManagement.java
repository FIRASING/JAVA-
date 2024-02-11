import java.util.Scanner;

public class ZooManagement {
    public static void main (String[] args) {
        int nbrCages;
        String zooName;
        System.out.println("donner le nom du zoo");
        Scanner k=new Scanner(System.in);
        zooName=k.nextLine();
        System.out.println("donner le nombres des cages ");
        nbrCages=k.nextInt();
        System.out.println(zooName+" contient "+nbrCages+"  cages");
        ZOO myZoo = new ZOO("hahha", "ariana", 7);
        Animal lion = new Animal("kkkk", "rrr", 3, true);
        Animal chien = new Animal("uuiu", "hhk", 5, false);
        Animal gazelle = new Animal("gggj", "hhppp", 4, false);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        myZoo.addAnimal(lion);
         myZoo.addAnimal(chien);
        myZoo.addAnimal(gazelle);
     myZoo.displayAnimals();
     int h=myZoo.searchAnimal(gazelle);
        System.out.println(h);
    }
}
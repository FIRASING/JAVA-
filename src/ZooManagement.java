import java.util.Scanner;

public class ZooManagement {
    public static void main (String[] args) {

       /*PARTIE 1
       int nbrCages=20;
        string zooName="myZoo";
        System.out.println(zooName+" contient "+nbrCages+"cages");*/
        //PARTIE 2
        int nbrCages;
        String zooName;
        System.out.println("donner le nom du zoo");
        Scanner k=new Scanner(System.in);
        zooName=k.nextLine();
        System.out.println("donner le nombres des cages ");
        nbrCages=k.nextInt();
        System.out.println(zooName+" contient "+nbrCages+"  cages");
        /*ZOO myZoo = new ZOO();
        Animal lion = new Animal();
        lion.family = "ggg";
        lion.name = "firas";
        lion.age = 22;
myZoo.nbrCages=10;
myZoo.city="ariana";
myZoo.name="rtx";
myZoo.animals[0]=lion;*/
        ZOO myZoo = new ZOO("hahha", "ariana", 7);
        Animal lion = new Animal("kkkk", "rrr", 3, true);
        Animal chien = new Animal("uuiu", "hhk", 5, false);
        Animal gazelle = new Animal("gggj", "hhppp", 4, false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        boolean lionAdded = myZoo.addAnimal(lion);
        boolean chienAdded = myZoo.addAnimal(chien);
        boolean gazelleAdded = myZoo.addAnimal(gazelle);

    }
}
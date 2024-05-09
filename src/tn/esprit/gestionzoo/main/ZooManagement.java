package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages;
        String zooName;
        System.out.println("Enter the name of the zoo:");
        Scanner k = new Scanner(System.in);
        zooName = k.nextLine();
        System.out.println("Enter the number of cages:");
        nbrCages = k.nextInt();
        System.out.println(zooName + " contains " + nbrCages + " cages.");

        ZOO myZoo = new ZOO(zooName, "ariana", nbrCages);
        Animal lion = new Animal("kkkk", "firas", 3, true);
        Animal chien = new Animal("uuiu", "chadi", 5, false);
        Animal gazelle = new Animal("gggj", "wral", 4, false);
        Animal fakrounnnn = new Animal("jonnnnnger", "khaaaalti", 4, false);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(chien);
        myZoo.addAnimal(gazelle);

        myZoo.displayAnimals();

        int h = myZoo.searchAnimal(gazelle);
        System.out.println("Search result for gazelle: " + h);
        aquatic at = new aquatic();
        Dauphin dio =new Dauphin();
        punguin pip= new punguin();
        dio.swim();
        at.swim();



    }}
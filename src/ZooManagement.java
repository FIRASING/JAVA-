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


    }
}

package tn.esprit.gestionzoo.entities;

public class aquatic extends Animal{
String habitat;

    public aquatic() {
    }

    public aquatic(String family, String name, boolean isMammal) {
    }


    @Override
    public String toString() {
        return "aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
public void swim(){
    System.out.println("this aquatic animal");
}
}


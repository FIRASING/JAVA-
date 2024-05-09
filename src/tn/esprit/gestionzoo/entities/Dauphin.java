package tn.esprit.gestionzoo.entities;

public class Dauphin extends aquatic {
    float swimingdepth;
    public Dauphin() {

    }
    public Dauphin(String family, String name, int age, boolean isMammal)
    {
super(family,name,isMammal);
        this.swimingdepth=swimingdepth;
    }

    @Override
    public String toString() {
        return "Dauphin{" +
                "swimingdepth=" + swimingdepth +
                '}';
    }
    public void swim(){
        System.out.println("this dolphin is swiming ");
    }
}

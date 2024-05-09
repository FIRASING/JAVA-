package tn.esprit.gestionzoo.entities;

public class  punguin extends aquatic {
float swimingdepth;


    public punguin(String family, String name, boolean isMammal) {
        super(family, name, isMammal);
        this.swimingdepth=swimingdepth;
    }

    @Override
    public String toString() {
        return "punguin{" +
                "swimingdepth=" + swimingdepth +
                '}';
    }

    public punguin() {

    }
}

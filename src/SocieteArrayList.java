import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion {

    List<Employ> maliste = new ArrayList<>();

    @Override
    public boolean ajouterEmploye(Object o) {
        if (o instanceof Employ) {
            Employ emp = (Employ) o;
            maliste.add(emp);

        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employ employe : maliste) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }



    @Override
    public boolean rechercherEmploye(Object o) {
        Employ emp = null;
        if (o instanceof Employ) {
            emp = (Employ) o;
        }
        if (maliste.contains(emp)) {
            return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Object o) {
        if (o instanceof Employ) {
            Employ emp = (Employ) o;
            maliste.remove(emp);

        }
    }
    public void displayEmploye() {
        for (Employ employe : maliste) {
            System.out.println(employe);
        }
    }

    public void trierEmployeParId() {
        Collections.sort(maliste, Comparator.comparing(Employ::getId));
    }


    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(maliste, Comparator.comparing(Employ::getNom)
                .thenComparing(Employ::getNomdep)
                .thenComparing(Employ::getGrade));
    }


}



import java.util.Objects;

public class Employ {
    int id;
    String nom;
    String prénom;
    String nomdep;
    String grade;

    public Employ() {
    }
    public Employ(int id,String nom,String prénom,String nomdep,String grade)
    {
        this.id=id;
        this.nom=nom;
        this.prénom=prénom;
        this.nomdep=nomdep;
        this.grade=grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employ)
        {
            Employ emp=(Employ)o;
            if(emp.nom.equals(this.nom)&& id== emp.id)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", nomdep='" + nomdep + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getPrénom() {
        return prénom;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prénom, nomdep, grade);
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNomdep() {
        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

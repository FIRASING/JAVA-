import java.util.Objects;

public class Departement {
        private int id;
        private String nom;
        private int nombreEmployes;

        // Constructeur sans paramètre
        public Departement() {
        }

        // Constructeur avec paramètres
        public Departement(int id, String nom, int nombreEmployes) {
            this.id = id;
            this.nom = nom;
            this.nombreEmployes = nombreEmployes;
        }

        // Getters et Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getNombreEmployes() {
            return nombreEmployes;
        }

        public void setNombreEmployes(int nombreEmployes) {
            this.nombreEmployes = nombreEmployes;
        }

        // Redéfinition de la méthode equals
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Departement departement = (Departement) obj;
            return id == departement.id &&
                    Objects.equals(nom, departement.nom);
        }

        // Redéfinition de la méthode toString
        @Override
        public String toString() {
            return "Departement{" +
                    "id=" + id +
                    ", nom='" + nom + '\'' +
                    ", nombreEmployes=" + nombreEmployes +
                    '}';
        }

        }

        // Redéfinition de la méthode toString




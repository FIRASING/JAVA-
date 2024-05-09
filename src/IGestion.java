
    public interface IGestion<T>{

        public boolean ajouterEmploye(T t);
        public boolean rechercherEmploye(String nom);
        public boolean rechercherEmploye(T t);
        public void supprimerEmploye(T t);
        public void displayEmploye();
        public void trierEmployeParId();
        public void trierEmployeParNomDépartementEtGrade();

        //void ajouterEmploye(Employ P);

        //boolean rechercherEmploye(Employ P);

        //void supprimerEmploye(Employ P);
    }


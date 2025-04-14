package modules;
public  class etudiant {
    protected static int idetudiant=0;
    protected int id;
    protected String nom;
    protected String prenom;
    protected String filiere;
    protected String sexe;
    public etudiant(String nom, String prenom, String filiere, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.sexe = sexe;
        this.id=++idetudiant;
    }
    public etudiant(int id,String nom, String prenom, String filiere, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.sexe = sexe;
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getFiliere() {
        return filiere;
    }
    public String getSexe() {
        return sexe;
    }  

}

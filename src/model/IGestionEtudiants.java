package model;
import java.util.List;
public interface IGestionEtudiants {
    public etudiant ajouterEtudiant(etudiant e);
    public List<etudiant> rechercherParMC(String mc);
    public void trierListeEtudiantsParNom();
    public List<etudiant> listeDesEtudiants();
    public void supprimerEtudiant(int id);
    public void setEtudiants(List<etudiant> etudiants);
}
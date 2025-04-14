package modules;
import java.util.ArrayList;
import java.util.List;
public class GestionEtudiants implements IGestionEtudiants {
    //list
    private List<etudiant> etudiants;
    public GestionEtudiants() {
        etudiants = new ArrayList<>();
    }
    @Override
    public etudiant ajouterEtudiant(etudiant e){
        etudiants.add(e);
        return e;
    }

      @Override
    public List<etudiant> rechercherParMC(String mc) {
        List<etudiant> ls = new ArrayList<>();
        for (etudiant e : etudiants) {
            if (e.nom.contains(mc)) {
                ls.add(e);
            }
        }
        return ls;
    }

    @Override
    public void trierListeEtudiantsParNom() {
        etudiants.sort((etudiant e1, etudiant e2) -> e1.nom.compareTo(e2.nom));
    }

    @Override
    public List<etudiant> listeDesEtudiants() {
        return etudiants;
    }
    @Override
    public void supprimerEtudiant(int id) {
        etudiants.removeIf(e -> e.id == id);
    }
    
}

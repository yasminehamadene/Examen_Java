import java.util.ArrayList;
import java.util.List;

public class Projet {

    private String nom;
    private List<Taches> taches;
    private GestionTaches gestionTaches;

    public Projet(String nom, GestionTaches gestionTaches) {
        this.nom = nom;
        this.gestionTaches = gestionTaches;
        this.taches = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Taches> getTaches() {
        return taches;
    }

    public void ajouterTache(String titre, String description) {
        Taches nouvelleTache = new Taches(titre, description);
        gestionTaches.ajouterTache(titre, description);
        taches.add(nouvelleTache);
    }

    public void completerTache(String titre) {
        for (Taches tache : taches) {
            if (tache.getTitre().equals(titre)) {
                tache.setCompletee(true);
                gestionTaches.completerTache(titre); // Mettre à jour la gestion des tâches
                return;
            }
        }
    }

    public boolean verifierTache(String titre) {
        for (Taches tache : taches) {
            if (tache.getTitre().equals(titre)) {
                return tache.estCompletee();
            }
        }
        return false;
    }
}

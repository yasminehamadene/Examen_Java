import java.util.ArrayList;
import java.util.List;

public class GestionTaches {
    private List<Taches> listeTaches;

    public GestionTaches() {
        this.listeTaches = new ArrayList<>();
    }
 //ajouter une nouvelle tâche à la liste
    public void ajouterTache(String titre, String description) {
        Taches nouvelleTache = new Taches(titre, description);
        listeTaches.add(nouvelleTache);
    }
// marquer une tâche comme complétée en utilisant son titre
    public void completerTache(String titre) {
        for (Taches tache : listeTaches) {
            if (tache.getTitre().equals(titre)) {
                tache.setCompletee(true);
                return;
            }
        }
    }
// verifier si la tache est completée ou non
    public boolean verifierTache(String titre) {
          for (Taches tache : listeTaches) {
            if (tache.getTitre().equals(titre)) {
                return tache.estCompletee();
            }
        }
        return false;
    }
}

import java.util.ArrayList;
import java.util.List;

public class GestionTaches {
    private List<Taches> listeTaches;

    public GestionTaches() {
        this.listeTaches = new ArrayList<>();
    }

    public void ajouterTache(String titre, String description) {
        Taches nouvelleTache = new Taches(titre, description);
        listeTaches.add(nouvelleTache);
    }

    public void completerTache(String titre) {
        for (Taches tache : listeTaches) {
            if (tache.getTitre().equals(titre)) {
                tache.setCompletee(true);
                return;
            }
        }
    }

    public boolean verifierTache(String titre) {
          for (Taches tache : listeTaches) {
            if (tache.getTitre().equals(titre)) {
                return tache.estCompletee();
            }
        }
        return false;
    }
}
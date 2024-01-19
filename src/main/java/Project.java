import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void testAjouterTacheAuProjetEtGestionTaches() {
        GestionTaches gestionTaches = new GestionTaches();
        Projet projet = new Projet("Mon Projet", gestionTaches);

        // Ajouter une tâche au projet
        projet.ajouterTache("Tâche 1", "Description ......de la tâche 1");

        // Vérifier que la tâche est ajoutée au projet
        assertEquals(1, projet.getTaches().size());

        // Vérifier que la tâche est également ajoutée à la gestion des tâches
        assertTrue(gestionTaches.verifierTache("Tâche 1"));
    }

}

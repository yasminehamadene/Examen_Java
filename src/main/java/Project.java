import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectTest {

    // Test pour vérifier l'ajout d'une tâche au projet et à la gestion des tâches
    @Test
    public void testAjouterTacheAuProjetEtGestionTaches() {
        GestionTaches gestionTaches = new GestionTaches(); // instance de GestionTaches
        Projet projet = new Projet("Mon Projet", gestionTaches); 

        // Ajouter une tâche au projet
        projet.ajouterTache("Tâche 1", "Description ......de la tâche 1");
        
        assertEquals(1, projet.getTaches().size());

        assertTrue(gestionTaches.verifierTache("Tâche 1"));
    }

}

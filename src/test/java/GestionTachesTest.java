import org.junit.Test;
import static org.junit.Assert.*;

public class GestionTachesTest {

    @Test
    public void testAjouterTache() {
        GestionTaches gestionTaches = new GestionTaches();
        gestionTaches.ajouterTache("Tâche 1", "Description ......de la tâche 1");
        assertEquals(1, gestionTaches.getNombreTaches());
    }

    @Test
    public void testCompleterTacheTacheInexistante() {
        GestionTaches gestionTaches = new GestionTaches();
        assertFalse(gestionTaches.completerTache("Tâche inexistante"));
    }

    @Test
    public void testVerifierTacheTacheInexistante() {
        GestionTaches gestionTaches = new GestionTaches();
        assertFalse(gestionTaches.verifierTache("Tâche inexistante"));
    }

    @Test
    public void testVerifierTache() {
        GestionTaches gestionTaches = new GestionTaches();
        gestionTaches.ajouterTache("Tâche 2", "Description ...de la tâche 2");
        assertFalse(gestionTaches.verifierTache("Tâche 2"));
        gestionTaches.completerTache("Tâche 2");
        assertTrue(gestionTaches.verifierTache("Tâche 2"));
    }
}
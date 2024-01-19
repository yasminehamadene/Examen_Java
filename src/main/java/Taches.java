public class Taches {
    private String titre;
    private String description;
    private boolean completee;

    public Taches(String titre, String description) {
        this.titre = titre;
        this.description = description;
        this.completee = false;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public boolean estCompletee() {
        return completee;
    }

    public void setCompletee(boolean completee) {
        this.completee = completee;
    }
}

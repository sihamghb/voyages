public class Annonce {
    private String titre;
    private String description;
    private String periode;
    private double budget;
    private static int dernierId = 0;
    private int id; 
    private int utilisateurId;  

    public Annonce(String titre, String description, String periode, double budget, int id, int utilisateurId) {
        this.titre = titre;
        this.description = description;
        this.periode = periode;
        this.budget = budget;
        this.id = generateId();
        this.utilisateurId = utilisateurId;
    }

    private static synchronized int generateId() {
        dernierId++; 
        return dernierId;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getPeriode() {
        return periode;
    }

    public double getBudget() {
        return budget;
    }

    public int getId() {
        return id;
    }

    public int getUtilisateurId() {
        return utilisateurId;
    }
}

import java.util.ArrayList;
import java.util.List;

public class GestionAnnonces {
    private List<Annonce> annonces;

    public GestionAnnonces() {
        this.annonces = new ArrayList<>();
    }

    public void ajouterAnnonce(Annonce annonce) {
        annonces.add(annonce);
        System.out.println("Annonce ajoutée avec succès : " + annonce.getTitre());
    }

    public void supprimerAnnonce(Annonce annonce) {
        annonces.remove(annonce);
        System.out.println("Annonce supprimée : " + annonce.getTitre());
    }

    public List<Annonce> getAnnonces() {
        return annonces;
    }

}

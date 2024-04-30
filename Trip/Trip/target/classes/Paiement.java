public class Paiement {
    private int idUtilisateur;
    private double prix;
    private String codePromo;

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCodePromo() {
        return codePromo;
    }

    public void setCodePromo(String codePromo) {
        this.codePromo = codePromo;
    }

    public Paiement(int idUtilisateur, double prix, String codePromo) {
        this.idUtilisateur = idUtilisateur;
        this.prix = prix;
        this.codePromo = codePromo;
    }

    public void effectuerPaiement() {
    }
}

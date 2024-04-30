public class Main {
    private static GestionAnnonces gestionAnnonces = new GestionAnnonces();

    public static void main(String[] args) {
        Utilisateur utilisateur = Utilisateur.sInscrire();
        utilisateur.ajouterAnnonce(gestionAnnonces);

    }
}

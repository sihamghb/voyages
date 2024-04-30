import java.util.Scanner;


public class Utilisateur {
    private String nom;
    private String prenom;
    private String phoneNumber;
    private String email;
    private String address;
    private String mdp;
    private static int dernierId = 0;
    private int id;

    private static Scanner scanner = new Scanner(System.in);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur(String nom, String prenom, String phoneNumber, String email, String address,String mdp, int id) {
        this.nom = nom;
        this.prenom = prenom;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.mdp = mdp;
        this.id = generateId();
    }

    public static Utilisateur sInscrire() {
        System.out.println("Inscription d'un nouvel utilisateur:");
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre numéro de téléphone: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        System.out.print("Entrez votre adresse: ");
        String address = scanner.nextLine();
        System.out.print("Entrez votre mot de passe: ");
        String mdp = scanner.nextLine();

        Utilisateur utilisateur = new Utilisateur(nom, prenom, phoneNumber, email, address, mdp);
        System.out.println("Utilisateur " + prenom + " " + nom + " inscrit avec succès avec l'ID " + utilisateur.getId());
        return utilisateur;
    }

    private static int generateId() {
        dernierId++;
        return dernierId;
    }

    public void seConnecter() {
        System.out.print("Entrez votre email: ");
        String inputEmail = scanner.nextLine();
        System.out.print("Entrez votre mot de passe: ");
        String inputMdp = scanner.nextLine();

        if (inputEmail.equals(email) && inputMdp.equals(mdp)) {
            System.out.println("Connexion réussie pour " + email);
        } else {
            System.out.println("Échec de la connexion. Email ou mot de passe incorrect.");
        }
    }

    public void seDeconnecter() {
        System.out.println("Déconnexion de l'utilisateur " + email);
    }

    public void supprimerCompte() {
    }

    public void modifierProfil() {
        System.out.print("Entrez votre nouveau nom: ");
        this.nom = scanner.nextLine();
        System.out.print("Entrez votre nouveau prénom: ");
        this.prenom = scanner.nextLine();
        System.out.print("Entrez votre nouveau numéro de téléphone: ");
        this.phoneNumber = scanner.nextLine();
        System.out.print("Entrez votre nouvel email: ");
        this.email = scanner.nextLine();
        System.out.print("Entrez votre nouvelle adresse: ");
        this.address = scanner.nextLine();

        System.out.println("Profil mis à jour pour l'utilisateur " + this.email);
    }

    public void ajouterAnnonce(GestionAnnonces gestionAnnonces) {
        System.out.println("Création d'une nouvelle annonce:");
        System.out.print("Entrez le titre de l'annonce: ");
        String titre = scanner.nextLine();
        System.out.print("Entrez la description de l'annonce: ");
        String description = scanner.nextLine();
        System.out.print("Entrez la période de l'annonce: ");
        String periode = scanner.nextLine();
        System.out.print("Entrez le budget pour l'annonce: ");
        double budget = Double.parseDouble(scanner.nextLine());
        System.out.print("Entrez l'ID de l'annonce: "); // L'ID devrait normalement être généré automatiquement
        int annonceId = Integer.parseInt(scanner.nextLine());

        Annonce nouvelleAnnonce = new Annonce(titre, description, periode, budget, annonceId, this.id);
        gestionAnnonces.ajouterAnnonce(nouvelleAnnonce);
        System.out.println("Annonce ajoutée avec succès.");
    }
}

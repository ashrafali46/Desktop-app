package Entites;
// Generated 7 juin 2019 19:30:34 by Hibernate Tools 4.3.1



/**
 * Personne generated by hbm2java
 */
public class Personne  implements java.io.Serializable {


     private String matricule;
     private String nom;
     private String prenom;
     private String fonction;
     private String motDePasse;

    public Personne() {
    }

    public Personne(String matricule, String nom, String prenom, String fonction, String motDePasse) {
       this.matricule = matricule;
       this.nom = nom;
       this.prenom = prenom;
       this.fonction = fonction;
       this.motDePasse = motDePasse;
    }
   
    public String getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getFonction() {
        return this.fonction;
    }
    
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
    public String getMotDePasse() {
        return this.motDePasse;
    }
    
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }




}


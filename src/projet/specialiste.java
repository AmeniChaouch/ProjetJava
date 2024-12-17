/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.Scanner;
import projet.Prescription;

/**
 *
 * @author ASUS
 */
public class specialiste implements Prescription{
    private String specialite;
    private String nom_medecin;

    public specialiste(String specialite, String nom_medecin) {
        this.specialite = specialite;
        this.nom_medecin = nom_medecin;
    }
   public specialiste (){
       specialite="";
       nom_medecin="";
       
   } 

    public String getSpecialite() {
        return specialite;
    }

    public String getNom_medecin() {
        return nom_medecin;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setNom_medecin(String nom_medecin) {
        this.nom_medecin = nom_medecin;
    }
    
    
    public void ajout_prescription()
    {
        Scanner s=new Scanner(System.in);
        specialite=s.nextLine();
        nom_medecin=s.nextLine();
    }
    public void affich_pres()
    {
        System.out.println(nom_medecin);
        System.out.println(specialite);
    }
    public String retour ()
    {
    return nom_medecin+": "+specialite;
    }
    public int  typepres(){
    return 3;
}
}

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
public class Analyse implements Prescription 
{
    private String nom;
    
    public Analyse (){
        nom="";
    }
public int  typepres(){
    return 1;
}
    public Analyse(String nom) {
        this.nom = nom;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void ajout_prescription()
    {
        Scanner s=new Scanner(System.in);
        nom=s.nextLine();
        
    }
    public void affich_pres()
    {
        System.out.println(nom);
      
    }
    public String retour(){
        return nom;
    }
}

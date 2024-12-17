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
public class medicament implements Prescription{
    private String nom_med;
    private float posologie;
    //

    public medicament (){
        nom_med="";
        posologie=0;
    }

    public medicament(String nom_med, float posologie) {
        this.nom_med = nom_med;
        this.posologie = posologie;
    }
    
    public String getNom_med() {
        return nom_med;
    }

    public float getPosologie() {
        return posologie;
    }
     public void ajout_prescription()
    {
        Scanner s=new Scanner(System.in);
        posologie=s.nextFloat();
        nom_med=s.nextLine();
    }

    public void setNom_med(String nom_med) {
        this.nom_med = nom_med;
    }

    public void setPosologie(float posologie) {
        this.posologie = posologie;
    }
    
    public medicament retour_med(String m,Float f){
        medicament med=new medicament();
        med.nom_med=m;
        med.posologie=f;
        return (med);
    }
    public void affich_pres()
    {
        System.out.println(nom_med);
        System.out.println(posologie);
    }
    public String retour()
    {
        return (nom_med+posologie+"");
    }
    public int  typepres(){
    return 2;
}
}

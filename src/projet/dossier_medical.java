/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;


import java.util.ArrayList;
import projet.Consultation;
import projet.date;


public  class dossier_medical {
    
    String clé;
    String nom_prenom;
    date date_nais;
    String genre;
    int nb_tel;
    static ArrayList <Consultation> tab;


    public dossier_medical()
    {   
        clé="" ;
        nom_prenom="" ;
        date_nais=new date();
        genre="";
        nb_tel=0;
        tab =new ArrayList <Consultation> ();
        
    }
    public dossier_medical(String ref,String nom_prenom,date date_nais,String genre,int nb_tel,ArrayList<Consultation> t)
    {
        this.clé=ref;
        this.nom_prenom=nom_prenom;
        this.date_nais=date_nais;
        this.genre=genre;
        this.nb_tel=nb_tel;
//        for (int i=0;i<tab.size();i++)
        {this.tab=t;}
    }

    public String getClé() {
        return clé;
    }

    public void setClé(String ref) {
        this.clé = ref;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }

    public void setNom_prenom(String nom_prenom) {
        this.nom_prenom = nom_prenom;
    }

    public date getDate_nais() {
        return date_nais;
    }

    public void setDate_nais(date date_nais) {
        this.date_nais = date_nais;
    }

    
    

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNb_tel() {
        return nb_tel;
    }

    public void setNb_tel(int nb_tel) {
        this.nb_tel = nb_tel;
    }

    public ArrayList <Consultation> getTab() {
        return tab;
    }

    public void setTab(ArrayList historique) {
        this.tab = historique;
    }
public void affichcons()
{
    for(int i=0;i<tab.size();i++)
    {
        tab.get(i).affcons();
    }
        
}

}

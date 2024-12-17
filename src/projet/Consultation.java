/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.ArrayList;
import projet.Prescription;
import projet.date;



public class Consultation {
    static int i=0;
    date date_cons;
    String diagnostic;
    ArrayList <Prescription> pres ;
    
    public Consultation()
    {
        i++;
        date_cons=new date();
        diagnostic="";
        pres =new ArrayList <Prescription> (); 
    }
    
    public Consultation(date date_cons,String diagnostic,ArrayList <Prescription>p){
        this.date_cons=date_cons;
        this.diagnostic=diagnostic;
        //for(int i=0;i<p.size();i++){
           this.pres=p;
       // }
    }

    public date getDate_cons() {
        return date_cons;
    }

    public void setDate_cons(date date_cons) {
        this.date_cons = date_cons;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public ArrayList<Prescription> getPrescription() {
        return pres;
    }

    public void setPrescription(ArrayList <Prescription> p) {
        this.pres = p;
    }
    
    public boolean comparaison (Object  c){
        Consultation o=(Consultation)c;
        return (diagnostic == o.diagnostic);
    }
    public void affcons()
    {
        System.out.println(diagnostic);
        System.out.println(date_cons.getJour()+"");
        for(int i=0;i<pres.size();i++)
        {
           pres.get(i).affich_pres();
        }
        
    }
}
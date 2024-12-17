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
public class Act_radio implements Prescription 
{
private String type_act;

    public String getType_act() {
        return type_act;
    }
    public Act_radio (){
    type_act="";
}

    public Act_radio(String type_act) {
        this.type_act = type_act;
    }

    public void setType_act(String type_act) {
        this.type_act = type_act;
    }
    
    
    public void ajout_prescription()
    {
        Scanner s=new Scanner(System.in);
        type_act=s.nextLine();
    }
    public void affich_pres()
    {
        System.out.println(type_act);
       
    }
    public String retour()
    {
        return type_act;
    }
    public int  typepres(){
    return 4;
}
    
}

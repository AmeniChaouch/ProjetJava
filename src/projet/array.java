/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author fadwa
 */
public class array {
    String maladie;
    int nb;

    public array(String maladie, int nb) {
        this.maladie = maladie;
        this.nb = nb;
    }
public array (){
    maladie="";
    nb=0;
}
    
    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }
    
    
    
}

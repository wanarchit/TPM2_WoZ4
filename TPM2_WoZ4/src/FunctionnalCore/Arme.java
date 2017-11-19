/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionnalCore;
/**
 *
 * @author Paul
 */
public class Arme {    
    private String nomArme;private int degatArme;
    public Arme(String nomArme, int degatArme) {this.nomArme = nomArme;this.degatArme = degatArme;}
    public String getNomArme() {return nomArme;}
    public void setNomArme(String nomArme) {this.nomArme = nomArme;}
    public int getDegatArme() {return degatArme;}
    public void setDegatArme(int degatArme) {this.degatArme = degatArme;}
}

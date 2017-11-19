/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionnalCore;import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class Player {
    
    private String var1;    private ArrayList<Arme> var2;     private int var3;    private int var4;

    public Player(String newName, 
            ArrayList<Arme> newListArme, int newStrenght, 
            int newArmor) {
this.var1 = newName;        this.var2 = newListArme;this.var3 = newStrenght;
                                            this.var4 = newArmor;
    }
public String getVar1() {return var1;}

    public void setVar1(String newName) {
this.var1 = newName;}

                                        public ArrayList<Arme> getVar2() {        return var2;
    }public void setVar2(ArrayList<Arme> newListArme) {this.var2 = newListArme;}

public                      int getVar3() 
    {        return var3;    }

public 
void 
setVar3(
int 
newStrenght) 
{
this.var3 = newStrenght;
}

    public int getVar4() {
        return var4;
    }

public void setVar4(int newArmor) {this.var4 = newArmor;}}

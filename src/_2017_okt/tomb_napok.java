/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2017_okt;
import java.util.*;
/**
 *
 * @author Dávid
 */
public class tomb_napok {
    public ArrayList<tomb_tanulo> t_t=new ArrayList<>();
    int ho, nap;
    public static int i=0;
    public static int x=0;
    

    public tomb_napok(int ho, int nap) {
        this.ho = ho;
        this.nap = nap;
        
    }
    
    public ArrayList<tomb_tanulo> getT_t() {
        return t_t;
    }

    public void setT_t(ArrayList<tomb_tanulo> t_t) {
        this.t_t = t_t;
    }

    public int getHo() {
        return ho;
    }

    public void setHo(int ho) {
        this.ho = ho;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public void set_t_t(tomb_tanulo t_t){
        this.t_t.add(t_t);
    }
    
    public void kiir(){
        for (tomb_tanulo object : t_t) {
            System.out.println("\t"+object.getElonev()+" "+object.getUtonev()+" "+object.getOrak());
        }
    }
    public void i_x(){
        for (tomb_tanulo object : t_t) {
            String i_x_o_n=object.getOrak();
            char[] betu=i_x_o_n.toCharArray();
            for (char c : betu) {
                if('I'==c){
                    i++;
                }
                if('X'==c){
                    x++;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return this.getHo()+" "+this.getNap();
    }
    
    
}

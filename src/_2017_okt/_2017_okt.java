/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2017_okt;
import java.util.*;
import java.io.*;
/**
 *
 * @author Dávid
 */
public class _2017_okt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        ArrayList<tomb_napok> t=new ArrayList<tomb_napok>();
        RandomAccessFile raf=new RandomAccessFile("naplo.txt", "r");
        String sor=raf.readLine();
        boolean v=true;
        while (v) {            
            String[] szavak=sor.split(" ");
            int nap=Integer.parseInt(szavak[2]);
            int ho=Integer.parseInt(szavak[1]);
            tomb_napok t_n=new tomb_napok(ho, nap);
            boolean v1=true;
            sor=raf.readLine();
            while (v1 && v) { 
                szavak=sor.split(" ");
                tomb_tanulo t_t=new tomb_tanulo(szavak[0],szavak[1], szavak[2]);
                t_n.set_t_t(t_t);
//                t.add(t_n);
                sor=raf.readLine();
                if(sor==null){
                    v=false;
                }else{
                    szavak=sor.split(" ");
                    if("#".equals(szavak[0])){
                        v1=false;
                    }
                } 
            }
            t.add(t_n);
        }
        raf.close();
        
        for (tomb_napok object : t) {
            System.out.println(object.getHo()+" "+object.getNap()+" ");
            object.kiir();
            object.i_x();
        }
        System.out.println("-o-o-o-o-o-o-");
        System.out.println("i:"+tomb_napok.i);
        System.out.println("x:"+tomb_napok.x);
        System.out.println("-o-o-o-o-o-o-");
        System.out.println("napok novekvo sorrendje:");
        Collections.sort(t, new Comparator<tomb_napok>(){
            @Override
            public int compare(tomb_napok o1, tomb_napok o2) {
               return Integer.valueOf(o1.getNap()).compareTo(o2.getNap());
            }
            
        });
        for (tomb_napok object : t) {
            System.out.println(object.getHo()+" "+object.getNap()+" ");
            object.kiir();
        }
    }

}


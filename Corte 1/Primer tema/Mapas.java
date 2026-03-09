/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatos;
import java.util.*;
/**
 *
 * @author esteban
 */
public class Mapas {
    public static void main(String[] args) {
        
        HashMap<Integer,String> mapa=new HashMap<>();         
//        Pide dos caracteres
        mapa.put(001,"Bogota");
        mapa.put(002,"Medellin");
        mapa.put(003,"Madrid");
        mapa.put(004,"Moscu");
        mapa.put(005,"Barranquilla");
        mapa.put(006,"Hulia");
        
        System.out.println(mapa);
        System.out.println();
        
       mapa.forEach((k,v)->System.out.println("Codigo ciudad "+k+"; nombre ciudad"+v));
       System.out.println();
       mapa.remove(6);
       System.out.println(mapa);
       System.out.println();
       
       Set city=mapa.entrySet();
       Iterator it=city.iterator();
       
       int cod;
       String nom;
       while(it.hasNext()){
           Map.Entry c =(Map.Entry)it.next();
           cod =(int)c.getKey();
           nom=c.getValue().toString();
           System.out.println("Codigo "+cod+"; Nombre "+nom);
       }
       System.out.println();
//       para cada
            
        for(Map.Entry <Integer,String> c: mapa.entrySet()){
            System.out.println("Codigo "+c.getKey()+"; Nombre"+c.getValue());
        }
        System.out.println();
        System.out.println(mapa.get(5));
        System.out.println();
    }
}

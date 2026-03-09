package estructuraclase;

public class EstructuraClase {
    public static void main(String[] args) {
//       
//        //creacion del objeto y llamado al constructor
//        Caballero c=new Caballero();
//        c.vida=10;
//       
//       c.setNombre("Shura");
//c.armadura protejida
        Caballero c=new Caballero();
        Caballero c1=new Caballero("Saga");
        Caballero c2=new Caballero("Saga",(byte)10);//Casting: conversion interna
        Caballero c3=new Caballero("Saga","explision",(byte)10);
        Caballero c4=new Caballero((byte)10);
        
        System.out.println(c.getNombre());
        System.out.println(c.getVida());
        System.out.println(c.getArma());
        System.out.println(c.getArmadura());
        
        System.out.println();
       
        System.out.println(c1.getNombre());
        System.out.println(c1.getVida());
        System.out.println(c1.getArma());
        System.out.println(c1.getArmadura());
        
         System.out.println();
         
         System.out.println(c2.getNombre());
        System.out.println(c2.getVida());
        System.out.println(c2.getArma());
        System.out.println(c2.getArmadura());
        
         System.out.println();
         
         System.out.println(c3.getNombre());
        System.out.println(c3.getVida());
        System.out.println(c3.getArma());
        System.out.println(c3.getArmadura());
        
         System.out.println();
         
         System.out.println(c4.getNombre());
        System.out.println(c4.getVida());
        System.out.println(c4.getArma());
        System.out.println(c4.getArmadura());
    }
   
}

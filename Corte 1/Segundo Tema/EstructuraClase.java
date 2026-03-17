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
//        Caballero c=new Caballero();
//        Caballero c1=new Caballero("Saga");
//        Caballero c2=new Caballero("Saga",(byte)10);//Casting: conversion interna
//        Caballero c3=new Caballero("Saga","explision",(byte)10);
//        Caballero c4=new Caballero((byte)10);
//        
//        System.out.println(c.getNombre());
//        System.out.println(c.getVida());
//        System.out.println(c.getArma());
//        System.out.println(c.getArmadura());
//        
//        System.out.println();
//       
//        System.out.println(c1.getNombre());
//        System.out.println(c1.getVida());
//        System.out.println(c1.getArma());
//        System.out.println(c1.getArmadura());
//        
//         System.out.println();
//         
//         System.out.println(c2.getNombre());
//        System.out.println(c2.getVida());
//        System.out.println(c2.getArma());
//        System.out.println(c2.getArmadura());
//        
//         System.out.println();
//         
//         System.out.println(c3.getNombre());
//        System.out.println(c3.getVida());
//        System.out.println(c3.getArma());
//        System.out.println(c3.getArmadura());
//        
//         System.out.println();
//         
//         System.out.println(c4.getNombre());
//        System.out.println(c4.getVida());
//        System.out.println(c4.getArma());
//        System.out.println(c4.getArmadura());
        
//       Armadura al=new Armadura();
        Caballero c5=new Caballero();
        c5.setNombre("Shura");
        c5.setArma("Excalibur");
        c5.setVida((byte) 10);
        c5.crearArmadura("Capricornio","Oro" ,"Le permite canalizar su cosmos" , 100, (float)0.99);
        
        System.out.println();
         
         System.out.println("Nombre es "+c5.getNombre());
        System.out.println("Vida= "+c5.getVida());
        System.out.println("Arma es "+c5.getArma());
        System.out.println("Constelacion "+c5.getArmadura().getCostelacion());
        System.out.println("Materiales armadura "+c5.getArmadura().getMateriales());
        System.out.println("Arma con la armadura "+c5.getArmadura().getArma());
        System.out.println("Poder con armadura "+c5.getArmadura().getPoder());
        System.out.println("Nivel de proteccion "+c5.getArmadura().getProteccion());
        System.out.println("Nivel de resistencia "+c5.getArmadura().getResistencia());
        System.out.println();
         System.out.println(c5.getArmadura().armarArmadura(c5.getNombre()));
         System.out.println(c5.getArmadura().desarmarArmadura());
    }  
    
}

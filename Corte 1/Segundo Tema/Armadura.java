/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuraclase;

/**
 *
 * @author ESTACION
 */
public class Armadura {
   private String costelacion;
   private String materiales;
   private int proteccion;
   private float resistencia;
   private String poder;
   private String arma;

    public String getCostelacion() {
        return costelacion;
    }
//operador de seguridad de la clase this
    public void setCostelaccion(String costelacion) {
        this.costelacion = costelacion;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public int getProteccion() {
        return proteccion;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
//constructor por defecto
    public Armadura() {
    }
    // sobrecarga
    public Armadura(int proteccion, float resistencia) {
        this.proteccion = proteccion;
        this.resistencia = resistencia;
    }
    public String armarArmadura(String nom){
        return "la armadura de"+ nom+" se armo";
    }
    public String desarmarArmadura(){
        return "la armadura  se desarmo"+this.costelacion;
    }
   
}

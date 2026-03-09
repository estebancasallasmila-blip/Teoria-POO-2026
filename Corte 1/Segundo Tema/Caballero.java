package estructuraclase;
/**
 *
 * @author ESTEBAN      
 */

//ESTRUCTURA CLASE
public class Caballero {
   
    //DECRARACION ATRIBUTOS
    private String arma;
    private String nombre;
    protected Armadura armadura;
    public byte vida;  
   
    //DEFINICIÓN
//    METODOS DE ATRIBUTOS SET / GET
    public String getNombre(){
        return this.nombre;
    }
   
    public void setNombre(String n){
        this.nombre=n;
    }
   
    //GET AND SET DE ARMA
     public String getArma(){
        return this.arma;
    }
   
    public void setArma(String m){
        this.arma=m;
    }
   
    //GET AND SET DE ARMADURA CAMBIA EL TIPO DE VARIABLES A (Armadura)
     public Armadura getArmadura(){
        return this.armadura;
    }
   
    public void setArmadura(Armadura a){
        this.armadura=a;
    }
   
    public byte getVida(){
        return this.vida;
    }
   
    public void setVida(byte v){
       this.vida=v;
    }
    
    //contructor
    public Caballero(){
        this.nombre="Shura";
        this.arma="Escalibur";
        this.vida=(byte)100;
    }
    
    //Sobrecarga del constructor
     public Caballero(String n){
        this.nombre=n;
    }
     //Segundo sobrecarga
        public Caballero(String n,byte v){
        this.nombre=n;
        this.vida=v;
    }
     //tercera sobrecarga   
        public Caballero(String n,String m,byte v){
        this.nombre=n;
        this.arma=m;
        this.vida=v;
        }
        
     //Cuarta sobrecarga
        public Caballero(byte v){
             this.vida=v;
        }
        
     
     //metodos de clase
    public void protejerAtenea(){
        //this
         
    }
   
}

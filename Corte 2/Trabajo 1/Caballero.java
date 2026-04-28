package CaballerosZ;

public abstract class Caballero {
    protected String nombre;
    protected String armadura;
    protected int poder;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
   
    
   //CONSTRUCTOR
     public Caballero(String nombre) {
        this.nombre = nombre;
    }
     
      public abstract String combatir();
      public  void obtPoder(){
          poder =(int)(Math.random()*10);
          this.setPoder(poder);
      }
     
//    protected String constelacion;
//    protected String tipoCosmo;
//    protected String proteccion;
    
    // Nuevos atributos numéricos
//    protected int puntosVida;
//    protected float puntosProteccion; // Ejemplo: 0.1f para 10%, 0.5f para 50%
//
//    public Caballero(String nombre, String constelacion, String tipoCosmo, String proteccion, int vida, float proteccionValor) {
//        this.nombre = nombre;
//        this.constelacion = constelacion;
//        this.tipoCosmo = tipoCosmo;
//        this.proteccion = proteccion;
//        this.puntosVida = vida;
//        this.puntosProteccion = proteccionValor;
//    }
//
//    public void mostrarEstado() {
//        System.out.println("--- Estado de " + nombre + " ---");
//        System.out.println("Vida: " + puntosVida);
//        System.out.println("Protección: " + (puntosProteccion * 100) + "%");
//    }
//
//    public void recibirDanio(int danioBase) {
//        int danioFinal = (int) (danioBase * (1 - puntosProteccion));
//        this.puntosVida -= danioFinal;
//        System.out.println(nombre + " recibió " + danioFinal + " de daño. Vida restante: " + puntosVida);
//    }
//
//    public void encenderCosmos() {
//        System.out.println(nombre + " está encendiendo su cosmos.");
//    }

   
}
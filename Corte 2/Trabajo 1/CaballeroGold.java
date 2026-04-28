
package CaballerosZ;

public class CaballeroGold extends Caballero {

    public CaballeroGold(String nombre) {
        super(nombre);
    }
    @Override
    public void obtPoder(){
//        int poder =(int)(Math.random()*10);
//          this.setPoder(poder);
        super.obtPoder();
//        System.out.print(super.getPoder()+" poder del padre");
//        System.out.print(this.getPoder()+" poder del hijo");
    }
    
    @Override
        public String combatir() {
        return "combatir";
        }
//    public CaballeroGold(String nombre, String constelacion, String tipoCosmo) {
//        // Vida: 500, Protección: 95% (0.95f)
//        super(nombre, constelacion, tipoCosmo, "Oro", 500, 0.95f);
//    }
//
//    public void meditacion() {
//        this.puntosVida += 50; // Recupera vida
//        System.out.println(nombre + " ha recuperado vida mediante meditación. Vida: " + puntosVida);
//    } 
//    public CaballeroGold(String nombre, String constelacion, String tipoCosmo) {
//        // Vida: 500, Protección: 95% (0.95f)
//        super(nombre, constelacion, tipoCosmo, "Oro", 500, 0.95f);
//    }
//
//    public void meditacion() {
//        this.puntosVida += 50; // Recupera vida
//        System.out.println(nombre + " ha recuperado vida mediante meditación. Vida: " + puntosVida);
//    }

    
}
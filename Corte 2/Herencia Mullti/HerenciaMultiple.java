
package herenciamultiple;

public class HerenciaMultiple {

    public static void main(String[] args) {
        Ornitorrinco or=new Ornitorrinco();
        or.setGlandulasMamarias(2);
        
        System.out.println("Tengo glandulas: "+or.getGlandulasMamarias());
        System.out.println("Tengo pico: "+or.pico);
        System.out.println("Tengo patas: "+or.patas);
        System.out.println(or.nadar());
        System.out.println(or.ponerHuevos());
        System.out.println(or.amamantar());
    }
    
}

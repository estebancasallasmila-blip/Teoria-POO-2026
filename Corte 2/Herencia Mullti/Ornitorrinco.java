
package herenciamultiple;

public class Ornitorrinco extends Mamifero implements InterAve,InterReptil{

    @Override
    public String ponerHuevos() {
        return "Pongo huevos";
    }
    
    @Override
    public String nadar(){
        return "Nado con las cuatro patas";
    }
    
}

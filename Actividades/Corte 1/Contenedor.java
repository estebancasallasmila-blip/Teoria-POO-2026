
package transportable;

import java.util.ArrayList;
import java.util.List;
public class Contenedor implements Transportable{
    private List<Transportable> contenido =new ArrayList<>();
    public void agregar (Transportable cosa){
        contenido.add(cosa);
    }
@Override
public double getPeso(){
    double pesoContenido= contenido.stream().mapToDouble(Transportable::getPeso).sum();
    return 100+pesoContenido;
}
@Override
public int getNivelPeligrosidad(){
    return contenido.stream()
            .mapToInt(Transportable::getNivelPeligrosidad)
            .max()
            .orElse(0);
}
}



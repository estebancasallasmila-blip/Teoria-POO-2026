package transportable;
import java.util.ArrayList;
import java.util.List;
public class Camion {
        private List<Transportable> carga=new ArrayList<>();
        private final double TARA = 1000; //CONVERSION DE UNA TONELADA A  KILOS
        private final double PESO_MAXIMO = 2500; //2.5 T A kg

        public void carga (Transportable cosa){
           carga.add(cosa);
}
        public void descarga (Transportable cosa){
            carga.remove(cosa);
        }
        public double pesoTotal(){
            double pesoCarga=carga.stream().mapToDouble(Transportable::getPeso).sum();
            return TARA + pesoCarga;
        }
        public boolean exesoDePeso(){
            return pesoTotal()>PESO_MAXIMO;
        }
        
       public List<Transportable> objPeligrosos(int n){
           return carga.stream()
                   .filter(c -> c.getNivelPeligrosidad()>n)
                   .toList();
       }
       
       public boolean PuedeCircular(int NivelMaxPeligrosidad){
           return carga.stream()
                   .noneMatch(c -> c.getNivelPeligrosidad()>NivelMaxPeligrosidad);
       }
}

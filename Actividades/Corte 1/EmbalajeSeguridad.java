package transportable;
public class EmbalajeSeguridad implements Transportable{
        private Transportable cosaEnvuelta;
        
    public EmbalajeSeguridad(Transportable cosa){
        this.cosaEnvuelta=cosa;
    }
    @Override
    public double getPeso(){
        return cosaEnvuelta.getPeso();
    }
    
    @Override
    public int getNivelPeligrosidad(){
    return cosaEnvuelta.getNivelPeligrosidad()/2;
    }
    
}
    
    

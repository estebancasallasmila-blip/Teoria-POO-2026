
package polimorfismosubtipado;
import java.util.Scanner;

public class PolimorfismoSubtipado {

    
    public static void main(String[] args) {
        
        Scanner lc=new Scanner (System.in);
        Animal animal=null; //Declarar el objeto de la clase padre
        char habla;
        System.out.println("Como desea que hable el animal");
        System.out.println("1.Perro");
        System.out.println("2.Gato");
        System.out.println("3.Pato");
        System.out.println("opcion:" );
        
        habla=lc.nextLine().charAt(0);
        switch(habla){
            case '1':
                animal=new Perro(); //Crear instancia desde las hijas
                System.out.println(animal.hacerHablar());
            break;
            case '2':
                animal=new Gato();
                System.out.println(animal.hacerHablar());
            break;
            case '3':
                animal=new Pato();
                System.out.println(animal.hacerHablar());
            break;
            default:
                System.out.println();
             break;
        }
    }
    
    
}

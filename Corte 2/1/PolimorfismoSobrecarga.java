
package polimorfismosobrecarga;
import java.util.Scanner;

public class PolimorfismoSobrecarga {

   
    public static void main(String[] args) {
        Scanner lc=new Scanner(System.in);
        
        Calculadora cal=new Calculadora();
        char opc;
        System.out.println("Que quiere sumar");
        System.out.println("1.Dos enteros");
        System.out.println("2.Dos dobles");
        System.out.println("3.Dos floats");
        System.out.println("4.Dos String");
        System.out.println("5.Dos Char");
        
        System.out.println("Su opcion");
        
        opc=lc.nextLine().charAt(0);
        
        switch(opc){
            case '1':
                int a,b;
                System.out.println("Ingrese valor de a:");
                a=Integer.parseInt(lc.nextLine());
                System.out.println("Ingrese valor de b:");
                b=Integer.parseInt(lc.nextLine());
                 System.out.println(cal.sumar(a, b));
            break; 
            case '2':
                double c,d;
                System.out.println("Ingrese valor de a:");
                c=Double.parseDouble(lc.nextLine());
                System.out.println("Ingrese valor de b:");
                d=Double.parseDouble(lc.nextLine());
                 System.out.println(cal.sumar(c, d));
            break; 
            case '3':
                float e,f;
                System.out.println("Ingrese valor de a:");
                e=Float.parseFloat(lc.nextLine());
                System.out.println("Ingrese valor de b:");
                f=Float.parseFloat(lc.nextLine());
                 System.out.println(cal.sumar(e, f));
            break; 
            case '4':
                String g,h;
                System.out.println("Ingrese valor de a:");
                g=lc.nextLine();
                System.out.println("Ingrese valor de b:");
                h=lc.nextLine();
                 System.out.println(cal.sumar(g, h));
            break;     
            case'5':
                char i,j;
                System.out.println("Ingrese valor de a:");
                i=lc.nextLine().charAt(0);
                System.out.println("Ingrese valor de b:");
                j=lc.nextLine().charAt(0);
                 System.out.println(cal.sumar(i, j));
            break;
            default:
                 System.out.println();
                break;
        }
    }
    
}

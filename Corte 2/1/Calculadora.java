
package polimorfismosobrecarga;

public class Calculadora {
    
    public String sumar(int a, int b){
        int c=a+b;
        return "La suma es: "+ c;
    }
    
    //SOBRECARGAS...
    
     public String sumar(double a, double b){
        double c=a+b;
        return "La suma es: "+ c;
    }
     
      public String sumar(float a, float b){
        float c=a+b;
        return "La suma es: "+ c;
    }
      
       public String sumar(String a, String b){
        String c=a+""+b;
        return "La suma es: "+ c;
    }
        public String sumar(char a, char b){
        String c=a+""+b;
        return "La suma es: "+ c;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdedatos;
import java.util.*;
/**
 *
 * @author esteb
 */
public class Colecciones {
    public static void main(String[] args) {
//       ArrayList lista=new ArrayList();
//        
//        //agregar elementos
//        lista.add(true);
//        lista.add("Hola mundo");
//        lista.add(3.1416);
//        lista.add('@');
//        lista.add(2);
//        lista.add(0);
//        lista.add("juan");
// 
//        System.out.println(lista);
//         System.out.println(lista.size());
//        //agregar posicion especifica
//         lista.add(2,56);
//        System.out.println(lista);
//        //Saber si contiene un item
//        System.out.println(lista.contains(false));
//         //posicion de un item o elemento
//        System.out.println(lista.indexOf("Hola mundo"));
//            
//        //remover un item
//        lista.remove(true);
//        System.out.println(lista);
//        lista.remove(2);
//        System.out.println(lista);
//        
//        //Conocer el tamaño
//        System.out.println(lista.size());
//        //Obtener un elemento
//        System.out.println(lista.get(2));
//          for(int i=0; i<lista.size();i++){
//            System.out.println(lista.get(i));
//    }
//        //remover un subconjunto
//        ArrayList<String> set=new ArrayList<>();
//        set.add("hola");
//        set.add("cu");
//           System.out.println(set);
//        
//        ArrayList<String> cadena=new ArrayList<>();
//        cadena.add("cadena");
//        cadena.add("hola");
//        cadena.add("hola");
//        cadena.add("hola");
//        cadena.add("sol");
//        cadena.add("que");
//        cadena.add("hola");
//        cadena.add("totto");
//        cadena.add("hola");
//        cadena.add("Salud");
//        cadena.add("coco");
//        cadena.add("tu");
//       cadena.add("celula");
//        cadena.add("mas");
//        
////        cadena.forEach(s->System.out.println(s)); //ciclo forEach que requiere plantilla
////        System.out.println(cadena);
////        
////        //remover un item si cumplen condiciones
////        cadena.removeAll(set);
////         System.out.println(cadena);
////        cadena.removeIf(s->s.length()==6); 
////         System.out.println(cadena);
////         cadena.removeIf(s->s.contains("a")); 
////         System.out.println(cadena);
////      cadena.removeIf(s->s.endsWith("o")); 
////         System.out.println(cadena);
////         
////         //Limpiar la colección
////         cadena.clear();
////         System.out.println(cadena);
////         
////         cadena.forEach(s->System.out.println(s));
//
//        Scanner lc=new Scanner (System.in);
//         
//        ArrayList<Integer> numeros=new ArrayList<Integer>();
//          char opc='s';
//          System.out.println("\ningrese los valores para la coleccion\n");
//          do{
//              numeros.add(Integer.parseInt(lc.nextLine()));
//              System.out.print("otro numero s / n");
//              opc=lc.nextLine().charAt(0);
//          }while(opc=='s' || opc=='S');
//          numeros.forEach(s->System.out.println(s));
//          System.out.println("La coleccion tiene "+numeros.size()+"\n");
//          numeros.removeIf(n->n<0);
//          numeros.forEach(s->System.out.println(s));
//          numeros.forEach(n->{
//              if(n%2==0)
//                System.out.println(n);});
          
//          HashSet <String> conjunto=new HashSet<>();
//          conjunto.add("HOLA");
//          conjunto.add("MUDO");
//          conjunto.add("Iglesia");
//          conjunto.add("NUVE");
//          conjunto.add("ECXEL");
//          conjunto.add("ESTEBAN");
//          conjunto.add("ORO");
//          conjunto.add("JUGO");
//          conjunto.add("tumba");
//          
//          
//          System.out.println(conjunto);
////          ELIMINAR
//           conjunto.remove("ORO");
//           System.out.println(conjunto);
//           //remover si se cumple dicho parameto
//           conjunto.removeIf(s->s.length()==4);
//           System.out.println(conjunto);
//           
//           conjunto.forEach(s->System.out.println(s));
//           System.out.println();
//           
//          //para cada
//          for(String s:conjunto){
//              System.out.println(s);
//          }
//          System.out.println();
//          //Saber si contine un elemento
//          System.out.println(conjunto.contains("sol"));
//          //Tamaño
//          System.out.println(conjunto.size());
//          System.out.println();
//          //otros CICLOS
//          Iterator it=conjunto.iterator();
//                  while(it.hasNext()){
//                      System.out.println(it.next().toString());
//                  }
//                  
//          conjunto.clear();
//           System.out.println();
//          System.out.println();
                  
                  TreeSet<Integer> num=new TreeSet<>();
                  num.add(23);
                  num.add(22);
                  num.add(21);
                  num.add(256);
                   num.add(-23);
                  num.add(01);
                  num.add(1092);
                  num.add(-43);
                  
          System.out.println(num);
          System.out.println();
          
          num.remove(23);
          System.out.println(num);
          num.removeIf(n->n<0);
          System.out.println(num);
          num.forEach(n->System.out.println(n));
           System.out.println();
           for(int n:num){
                System.out.println(n);
           }
           System.out.println();
          
         Iterator it=num.iterator();
          int n;
          while(it.hasNext()){
              n=(int)it.next()*2;              
              System.out.println(n);
          }
    }
}

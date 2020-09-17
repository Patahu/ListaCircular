/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author patro
 */
public class PruebaListaCircular {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante(1,"Nombre1","Apellido1",20);
        Estudiante e2=new Estudiante(2,"Nombre2","Apellido2",23);
        Estudiante e3=new Estudiante(3,"Nombre3","Apellido3",26);
        Estudiante e4=new Estudiante(4,"Nombre4","Apellido4",29);
        
        ListaCircular lista=new ListaCircular();
        lista.insertarInicio(e1);// (e1)0
        lista.insertarInicio(e2);// (e2)0, (e1)1
        lista.insertarInicio(e3); //(e3)0, (e2)1, (e1)2
        System.out.println(lista.visualizar());
        
        lista.insertarFinal(e4); // (e3) 0, (e2)1; (e1)2, (e4) 3
        System.out.println(lista.visualizar());
        System.out.println("Elemento buscado :"+lista.buscarElemento(0)+"Longitud"+lista.longitud());
        
       // lista.eliminarInicio();// "(e3) 0", (e2)1; (e1)2, (e4) 3
         //System.out.println(lista.visualizar());// (e2)0; (e1)1, (e4) 2
       //lista.eliminarFinal();//  (e2)0; (e1)1, "(e4) 2"
      //System.out.println(lista.visualizar());// (e2)0; (e1)1
       
    }
}

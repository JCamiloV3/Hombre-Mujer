
package Herenciajava;

public class Herenciajava {
    
    public static void main (String[]args){
        Humano adulto = new Humano ();
        adulto.setNombre("Fredeguer");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        System.out.println();
        
        Hombre padre = new Hombre();
        padre.setNombre("Alfredo");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarce();
        System.out.println();
        
        Mujer madre = new Mujer();
        madre.setNombre("Yulixa");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
           
    }
}

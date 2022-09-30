
package mundopc;

import com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        Raton raton1=new Raton("USB", "HP");
        Teclado teclado1=new Teclado("USB", "HP");
        Monitor monitor1=new Monitor("HP", 15);
        Computadora computadora1=new Computadora("Computadora HP: ", monitor1, teclado1, raton1);
        Raton raton2=new Raton("Bluetooth", "LG");
        Teclado teclado2=new Teclado("Bluetooth", "LG");
        Monitor monitor2=new Monitor("LG", 25);
        Computadora computadora2=new Computadora("Computadora LG: ", monitor2, teclado2, raton1);
        Raton raton3=new Raton("Bluetooth", "Apple");
        Teclado teclado3=new Teclado("USB", "Apple");
        Monitor monitor3=new Monitor("Apple", 30);
        Computadora computadora3=new Computadora("Computadora Apple: ", monitor3, teclado2, raton1);
       
        Orden orden1=new Orden();
        orden1.agregarComputadoras(computadora1);
        orden1.agregarComputadoras(computadora2);
        orden1.agregarComputadoras(computadora3);
        orden1.mostrarOrden();
        
        
        
    }
}

package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Raton raton1 = new Raton("hp", "USB");
        Teclado teclado = new Teclado("Logitech", "USB");
        Monitor monitor1 = new Monitor("LG", 1800);
        Computadora computadora1 = new Computadora("Computeishon", monitor1,teclado,raton1);
        Raton raton2 = new Raton("samsung", "USB");
        Teclado teclado2 = new Teclado("Logitech", "Bluethood");
        Monitor monitor2 = new Monitor("sony", 2400);
        Computadora computadora2 = new Computadora("Computeishon", monitor2,teclado2,raton2);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}

package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 5;

    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
    }
    public void mostrarOrden(){

        for (int i = 0; i < this.computadoras.length; i++) {
            if (computadoras[i] != null){
                System.out.println(computadoras[i]);
            }
        }
    }
}

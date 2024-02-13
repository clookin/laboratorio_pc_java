package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    private Monitor (){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    private int getIdMonitor() {
        return idMonitor;
    }

    private String getMarca() {
        return this.marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    private double getTamanio() {
        return this.tamanio;
    }

    private void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", tamanio=").append(tamanio);
        sb.append('}');
        return sb.toString();
    }
}

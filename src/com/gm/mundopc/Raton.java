package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;

    public Raton(String nombre, String tipoEntrada){
        super(nombre, tipoEntrada);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return this.idRaton;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append(" idRaton= ").append(idRaton);
        sb.append(" Marca= ").append(this.getMarca());
        sb.append(" Entrada= ").append(this.getTipoEntrada());
        sb.append('}');
        return sb.toString();
    }
}

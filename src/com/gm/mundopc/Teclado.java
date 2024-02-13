package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado (String nombre, String marca){
        super (nombre, marca);
        this.idTeclado=++Teclado.contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(" Marca= ").append(this.getMarca());
        sb.append(" Entrada= ").append(this.getTipoEntrada());
        sb.append('}');
        return sb.toString();
    }
}

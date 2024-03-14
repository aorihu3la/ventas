package com.aorihuela.appVentas.modelo;

public class Cliente {
    private String nombre;
    private String nif;

    // inicio geters and seters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "unCliente{" +
                "nombre='" + this.nombre + '\'' +
                ", nif='" + this.nif + '\'' +
                '}';
    }
}


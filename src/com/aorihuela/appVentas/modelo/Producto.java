package com.aorihuela.appVentas.modelo;
public class Producto {
    private Integer idProducto;
    private String nombre;
    private Float precio;
    private static Integer ultimoIdProducto = 0;



    // inicio getters and seters

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }


    // inicio de constructores

    public Producto() {
        this.idProducto = ++ultimoIdProducto;
    }


    // inicio metodos


}
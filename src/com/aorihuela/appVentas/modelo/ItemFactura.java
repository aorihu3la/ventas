package com.aorihuela.appVentas.modelo;

public class ItemFactura {
    private Integer cantidad;
    private Producto producto;

//    Constructor

    public ItemFactura(Integer cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }


//    inicio geters and seters

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //    Inicio de metodos propios
    public float calcularImporte (){
        return this.cantidad * this.producto.getPrecio();
    }
}

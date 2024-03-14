package com.aorihuela.appVentas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private Integer idFactura = 0;
    private String descripcion;
    private Date fechaFactura;
    private Cliente cliente;
    private ItemFactura[] items;
    private Integer indiceItems = 0;
    public static final Integer MAX_ITEMS = 10;
    private static Integer ultimoIdFactura = 0;



//    inicio constructor


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.idFactura = ++ultimoIdFactura;
        this.fechaFactura = new Date();
    }

    //    inicio geters and srters
    public Integer getIdFactura() {
        return idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    //    inicio metodos propios
    public void addItemFactura(ItemFactura item){
        if(indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public Double calcluarTotal(){
        Double total = 0d;
        for( ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String verDetalle(){
        StringBuilder sb = new StringBuilder("Factura Nro. ");
        sb.append(idFactura).append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tNro. Nif: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");
        SimpleDateFormat sd = new SimpleDateFormat("dd ' de ' MMMMM 'de' yyyy ");
        sb.append("\nFecha de venta: ")
                .append(sd.format(this.fechaFactura))
                .append("\n____________________________________")
                .append("\n#\tNombre\tCant.\tPrecio US$\tTotal\n");
        for (ItemFactura item: this.items){
            if(item == null){
                continue;
            }
            sb.append(item.getProducto().getIdProducto())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\n Gran total: ")
                .append(calcluarTotal());
        return sb.toString();
    }

}

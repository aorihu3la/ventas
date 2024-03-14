package com.aorihuela.appVentas;

import com.aorihuela.appVentas.modelo.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Al","1");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripcion de factura: ");
        String desc = sc.nextLine();
        Factura factura = new Factura(desc, cli);

        Producto producto;
        String nombre;
        Float precio;
        Integer cantidad;

        System.out.println();

        for(int i =0; i <1; i++){
            producto = new Producto();
            System.out.print("Ingrese producto N° " + producto.getIdProducto() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);
            System.out.println();
        }
        System.out.println(factura.verDetalle());

    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author asaen
 */
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor vacío
    public Producto() {
        nombre = "";
        precio = 0;
        cantidad = 0;
    }

    // Constructor con parámetros
    public Producto(String nombre, double precio, int cantidad) {
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    // Método de lógica
    public double calcularSubtotal() {
        return precio * cantidad;
    }

    // Método de lógica
    public boolean tieneStock() {
        return cantidad > 0;
    }
    
}

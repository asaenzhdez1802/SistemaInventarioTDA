/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;
import java.util.ArrayList;
/**
 *
 * @author asaen
 */
public class InventarioTDA {
    private ArrayList<Producto> productos;

    public InventarioTDA() {
        productos = new ArrayList<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Obtener productos
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Buscar producto por nombre
    public Producto buscarProducto(String nombre) {

        for (Producto producto : productos) {

            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        return null;
    }

    // Eliminar producto
    public boolean eliminarProducto(String nombre) {

        Producto producto = buscarProducto(nombre);

        if (producto != null) {
            productos.remove(producto);
            return true;
        }

        return false;
    }

    // Calcular dinero total almacenado
    public double calcularValorInventario() {

        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularSubtotal();
        }

        return total;
    }

    // Contar productos con poco stock
    public int contarStockBajo() {

        int contador = 0;

        for (Producto producto : productos) {

            if (producto.getCantidad() <= 5) {
                contador++;
            }
        }

        return contador;
    }

    // MÉTODO RECURSIVO
    public int contarProductosRecursivo(int posicion) {

        // Caso base
        if (posicion >= productos.size()) {
            return 0;
        }

        // Llamada recursiva
        return 1 + contarProductosRecursivo(posicion + 1);
    }

    public int obtenerTotalProductos() {
        return contarProductosRecursivo(0);
    }
    
}

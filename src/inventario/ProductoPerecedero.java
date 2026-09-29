/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author asaen
 */
public class ProductoPerecedero extends Producto {
    private int diasCaducidad;

    public ProductoPerecedero() {
        super();
        diasCaducidad = 0;
    }

    public ProductoPerecedero(
            String nombre,
            double precio,
            int cantidad,
            int diasCaducidad) {

        super(nombre, precio, cantidad);
        setDiasCaducidad(diasCaducidad);
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        if (diasCaducidad >= 0) {
            this.diasCaducidad = diasCaducidad;
        }
    }

    // Método de lógica
    public boolean estaPorCaducar() {
        return diasCaducidad <= 3;
    }
    
}

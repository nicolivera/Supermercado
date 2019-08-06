/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Clases;

import java.text.DecimalFormat;

public class ArticuloLimpieza extends Producto {
	// Construct
	public ArticuloLimpieza(String nombre, double precio, UnidadVenta unidadVenta) {
		setNombre(nombre);
		setPrecio(precio);
		setUnidadVenta(unidadVenta);
	}

	// implements methods java 8
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), getUnidadVenta().toString() + "ml",
				new DecimalFormat("$").format(getPrecio()));
	}
}
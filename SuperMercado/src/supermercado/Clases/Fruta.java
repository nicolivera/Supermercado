/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Clases;

import java.text.DecimalFormat;

public class Fruta extends Producto {
	// constructor
	public Fruta(String nombre, double precio, UnidadVenta unidadVenta) {
		setNombre(nombre);
		setPrecio(precio);
		setUnidadVenta(unidadVenta);
	}

	
	@Override
	public String toString() {
		return String.join(" /// ", getNombre(), "Precio: " + new DecimalFormat("$").format(getPrecio()),
				"Unidad de venta: " + getUnidadVenta().getNombreUnidad());
	}

   
}

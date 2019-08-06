/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.Clases;

import java.text.DecimalFormat;

public enum UnidadVenta {
	litros("Litros", 1.5), kg("kilo"), ml("contenido", 500);

	private String nombreUnidad;
	private double cantidad;

	private UnidadVenta(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	private UnidadVenta(String nombreUnidad, double cantidad) {
		this.nombreUnidad = nombreUnidad;
		this.cantidad = cantidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return getNombreUnidad() + " : " + new DecimalFormat().format(getCantidad());
	}

}

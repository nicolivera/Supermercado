/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import supermercado.Clases.ArticuloLimpieza;
import supermercado.Clases.Bebida;
import supermercado.Clases.Fruta;
import supermercado.Clases.ListaProducto;
import supermercado.Clases.UnidadVenta;

/**
 *
 * @author nikko
 */
public class SuperMercado {

	private ListaProducto listaProducto;

	public SuperMercado() {
		listaProducto = new ListaProducto();
		listaProducto.CargarProducto(new Bebida("Coca-Cola Zero", 20, UnidadVenta.litros));
		listaProducto.CargarProducto(new Bebida("Coca-Cola", 18, UnidadVenta.litros));
		listaProducto.CargarProducto(new ArticuloLimpieza("Shampoo sedal", 19, UnidadVenta.ml));
		listaProducto.CargarProducto(new Fruta("Frutillas", 64, UnidadVenta.kg));
		listaProducto.imprimirListaProd();

	}

	public static void main(String[] args) {
		new SuperMercado();
	}
}
   
    


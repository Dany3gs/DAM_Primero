
/*Ejercicio 2
Crear un array con los precios de los 5 artículos y otro con las cantidades vendidas por la empresa en su sucursal principal.
Informar:

	La recaudación de cada artículo.
	La recaudación total de la empresa.
	El artículo más vendido.
	El artículo que ha facturado más dinero.
*/

import java.util.Arrays;

public class Ejercicio2 {
	
	public static void main(String[] args) {

		double[] precios = {10.50, 23.43, 12.67, 5.90, 32.10};
		int[] cantidades = {   10,    15,    23,    34,    20};

		int posicionMasFacturo = 0;
		double recaudacionPorArticulo;
		double conMayorRecaudacion = 0;
		double ventasTotales = 0;
		int posicionMasVendido = 0;
		int masVendido = cantidades[0];

		System.out.println("La recaudación de cada artículo es:");
		System.out.println("--------------------------------------------");

		// Se calcula la recaudación de cada artículo
		for (int i = 0; i < cantidades.length; i++) {
			recaudacionPorArticulo = cantidades[i] * precios[i];
			ventasTotales += recaudacionPorArticulo;

			// Se calcula el que mayor recaudación obtuvo con su posición
			if (conMayorRecaudacion < recaudacionPorArticulo){
				conMayorRecaudacion = recaudacionPorArticulo;
				posicionMasFacturo = i + 1;
			}
			// Se imprime con función para limitar a dos decimales los resultados
			System.out.printf("Del artículo %d -> %.2f €\n", (i + 1), recaudacionPorArticulo);
		}

		// Se busca el artículo más vendido con su posición
		for (int i = 0; i < cantidades.length; i++) {
			if (cantidades[i] >= masVendido){
				masVendido = cantidades[i];
				posicionMasVendido = i + 1;
			}
		}

		// Se imprimen los resultados solicitados
		System.out.println("--------------------------------------------");
		System.out.println("Las ventas totales de la empresa son: " + ventasTotales + " €");
		System.out.println("--------------------------------------------");
		System.out.println("El artículo que más cantidad se vendió es el número: " + posicionMasVendido  + " con una cantidad de " + masVendido) ;
		System.out.println("--------------------------------------------");
		System.out.println("El artículo que más ha facturado esta en la posición: " + posicionMasFacturo + " y fué con " + conMayorRecaudacion + " €");
	}
}


/*
Ejercicio 1
De una empresa de transporte se quiere guardar el nombre de los conductores y los kilómetros que conducen cada día de la semana.
Para guardar esta información se van a utilizar dos arreglos:
	Nombre: vector para guardar los nombres de los conductores.
	kms: tabla para guardar los kilómetros que realizan cada día de la semana.
Se quiere generar un nuevo vector ("total_kms") con los kilometros totales que realiza cada conductor.
Al finalizar se muestra la lista con los nombres de los conductores y los kilómetros que ha realizado.
*/


public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		String[] conductor ={"Pepe", "Leandro", "Moises","Daniel", "Aridane"};
		String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		
		// Cada elemento equivale a cada conductor
		int[] kmsLunes =     {100, 200, 300, 400, 500};
		int[] kmsMartes =    {100, 200, 300, 400, 500};
		int[] kmsMiercoles = {100, 200, 300, 400, 500};
		int[] kmsJueves =    {100, 200, 300, 400, 500};
		int[] kmsViernes =   {100, 200, 300, 400, 500};
		
		// En la suma total se indica 5 elementos por los días de la semana
		int[] total_kms = new int[5];
		
		// Rellenamos el array de la suma total de kilómetros por conductor
		for (int i = 0; i < total_kms.length; i++) {
			total_kms[i] = kmsLunes[i] + kmsMartes[i] + kmsMiercoles[i] + kmsJueves[i] + kmsViernes[i];
		}

		// Imprimimos por pantalla
		for (int i = 0; i < dia.length; i++) {
			System.out.println("El conductor " + conductor[i] + " condujo un total de " + total_kms[i] + " kms.");
		}
	}
}

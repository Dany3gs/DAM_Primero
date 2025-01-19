public class Main {
	public static void main(String[] args) {
		String[] conductor ={"Pepe", "Leandro", "Moises","Daniel", "Aridane"};
		String[] dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
		int[] kmsLunes =     {100, 200, 300, 400, 500};
		int[] kmsMartes =    {100, 200, 300, 400, 500};
		int[] kmsMiercoles = {100, 200, 300, 400, 500};
		int[] kmsJueves =    {100, 200, 300, 400, 500};
		int[] kmsViernes =   {100, 200, 300, 400, 500};
		int[] total_kms = new int[5];
		for (int i = 0; i < total_kms.length; i++) {
			total_kms[i] = kmsLunes[i] + kmsMartes[i] + kmsMiercoles[i] + kmsJueves[i] + kmsViernes[i];
		}
		for (int i = 0; i < dia.length; i++) {
			System.out.println("El conductor " + conductor[i] + " condujo un total de " + total_kms[i] + " kms.");
		}
	}
}
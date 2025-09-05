public class Busqueda
{
	public static void main(String[] args) {
		int [] numeros = {1,3, 5,7, 9};
		int buscando = 1;
		boolean encontrado = false;

		for (int num : numeros) {
			if (num == buscando){
			   encontrado = true;
			   break;
			 }
			}
			if (encontrado){
			    System.out.println("Numero encontrado");
			}else {
			    System.out.println("Numero no encontrado");
			}
	}
}
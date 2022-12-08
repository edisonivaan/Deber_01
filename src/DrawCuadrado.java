import java.util.Scanner;

public class DrawCuadrado {
	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		System.out.println("Ingrese el numero de signos con el cual desea formar la O");
		int num = ingresoDatos.nextInt();
		//LINEA SUPERIOR DE LA FORMA
		/*
		 * Este for crea un bucle que crea asteriscos y circulos hasta cumplir una condicion
		 * ingresada por teclado, si el modulo del numero ingresado es 0, se imprime una x y 
		 * si el modulo es diferente de 0 se imprime un o
		 */
		for(int i = 0; i < num; i++) {
			if(i%2==0) {
				System.out.print("x ");
			}else {
				System.out.print("o ");
			}
		}
		System.out.println();
		//CENTRO DE LA FORMA
		/*
		 * Este for crea los las lineas laterales del cuadrado, se reduce 2 al valor ingresado porque
		 * dos de las lineas que deben existir ya son creadas por la linea superior e inferior
		 */
		for(int i = 0; i < num-2; i++) {
			System.out.print("x");
			/*
			 * Este for crea los espacios en blanco en el centro de la figura, se reduce 2 al valor ingresado porque
			 * estos son asteriscos creados por el for anterior
			 */
			for(int j = 0; j < num-2; j++) {
				System.out.print("  ");
			}
			System.out.println(" o");
		}
		//LINEA INFERIOR DE LA FORMA
		/*
		 * Este for crea un bucle que crea asteriscos y circulos hasta cumplir una condicion
		 * ingresada por teclado, si el modulo del numero ingresado es 0, se imprime una x y 
		 * si el modulo es diferente de 0 se imprime un o
		 */
		for(int i = 0; i < num; i++) {
			if(i%2==0) {
				System.out.print("x ");
			}else {
				System.out.print("o ");
			}
		}
	}

}
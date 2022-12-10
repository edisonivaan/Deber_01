import java.util.Arrays;
import java.util.Scanner;

public class Combinaciones {
    
    /**
     * Metodo para calcular el número de combinaciones posibles en un grupo de elementos, 
     * siendo n el numero de elementos y k la cantidad de elementos del grupo que se desea
     * formar en cada combinación
     * @param nFactorial - Termino factorial de n
     * @param kFactorial - Termino factorial de k
     * @param nMenosKFactorial - Termino factorial de (n-k)
     * @return Número de combinaciones posibles
     */
    public static int calcularCombinaciones(int nFactorial, int kFactorial, int nMenosKFactorial) {
        int numCombinaciones = nFactorial/(nMenosKFactorial*kFactorial);
        return numCombinaciones;
    }

    /**
     * Metodo para calcular el factorial de un número
     * @param numeroACalcular - Número a calcular su factorial
     * @return - Factorial de un número
     */
    public static int calcularFactorial(int numeroACalcular) {
		int resultado;
		if (numeroACalcular < 0) {
			System.err.println("El numero ingresado no permite calcular el factorial, debe ser un numero positivo");
			return 0;
		}else if(numeroACalcular == 1 || numeroACalcular == 0) {
			return 1;
		}else {
			resultado = numeroACalcular * calcularFactorial(numeroACalcular-1);
			return resultado;
		}
	}

    /**
     * Metodo para presentar las combinaciones posibles de un grupo de elementos
     * @param elementos - grupo de elementos
     * @param elementGrupos - numero de elementos a mostrar en cada combinacion
     */
    public static void inmprimirPosiblesCombinaciones(String[] elementos, int elementGrupos) {
        //Caso cuando elije grupos de 1 elemento
        if (elementGrupos == 1) {
            System.out.println("Las combinaciones posibles son:");
			for (int i = 0; i < elementos.length; i++) { // Este for fija el primer elemento de mi arreglo tipo String.
                    System.out.println(elementos[i]);
			}
		}

        //Caso cuando elije grupos de 2 elementos
		if (elementGrupos == 2) {
            System.out.println("Las combinaciones posibles son:");
			for (int i = 0; i < elementos.length; i++) {
				for (int j = i + 1; j < elementos.length; j++) {
                    System.out.print(elementos[i]);
					System.out.println(elementos[j]);
				}
			}
		}

        //Caso cuando elije grupos de 2 elementos
		if (elementGrupos == 3) {
            System.out.println("Las combinaciones posibles son:");
			for (int i = 0; i < elementos.length; i++) {
				for (int j = i + 1; j < elementos.length; j++) {
					for (int h = j + 1; h < elementos.length; h++) {
						System.out.print(elementos[i]);
						System.out.print(elementos[j]);
						System.out.println(elementos[h]);
					}

				}
			}

		}

        //Caso cuando elije grupos de 2 elementos
        if (elementGrupos == 4) {
            System.out.println("Las combinaciones posibles son:");
			for (int i = 0; i < elementos.length; i++) {
				for (int j = i + 1; j < elementos.length; j++) {
					for (int h = j + 1; h < elementos.length; h++) {
                        for(int g = h+ 1; g < elementos.length; g++){
                            System.out.print(elementos[i]);
						    System.out.print(elementos[j]);
						    System.out.print(elementos[h]);
                            System.out.println(elementos[g]);
                        }
					}
				}
			}

		}

        //Caso cuando elije grupos del mismo numero de elementos totales
        if (elementGrupos == elementos.length) {
            System.out.println("Las combinaciones posibles son:");
            for(int i = 0; i < elementos.length; i++){
                System.out.print(elementos[i]);
            }
		}
    }

    public static void main(String[] args) {
       //Definición de variables y Scanner
        Scanner sc = new Scanner(System.in);
        String [] elementos = {"a", "b", "c", "d", "e"};
        int numElementos = elementos.length;
        System.out.println("***************************************************************************************");
        System.out.println("El numero de elementos de este array es " + numElementos + " y los elementos son " + Arrays.toString(elementos));
        //Se solicita al usuario elegir la cantidad de elementos para formar cada grupo
        System.out.println("Digite la cantidad de cuantos elementos quiere formar cada grupo");
        System.out.println("*RECUERDA*, hay "+ numElementos + " elementos. No puedes elegir un número mayor que este");
        int elementGrupos = sc.nextInt();

        //Presentacion del numero de combinaciones posibles bajo ciertas condiciones
        if(elementGrupos<=numElementos){
        //Calculo independiente de n!, k! y (n-k)! para luego calcular el número de combinaciones posibles
        int nFactorial = calcularFactorial(numElementos);
	    //System.out.println(nFactorial);
        int kFactorial = calcularFactorial(elementGrupos);
        //System.out.println(kFactorial);
        int nMenosKFactorial = calcularFactorial((numElementos-elementGrupos));
        //System.out.println(nMenosKFactorial);

        //Metodo para calcular el numero de combinaciones
        int combinaciones = calcularCombinaciones(nFactorial, kFactorial, nMenosKFactorial);
            if(elementGrupos == 0){
                System.err.println("No se puede hacer combinaciones de 0 elementos");
            }else{
                if(elementGrupos <= numElementos && elementGrupos > 0)
                    System.out.println("El numero de combinaciones posibles en grupos de " + elementGrupos + " es " + combinaciones);
            }    
        }else{
            System.err.println("*ERROR*, no puedes calcular combinaciones en grupos de más elementos que los que hay en el grupo principal");
        }

        //Impresion de las combinaciones posibles
        inmprimirPosiblesCombinaciones(elementos, elementGrupos);
        sc.close();
    }
}
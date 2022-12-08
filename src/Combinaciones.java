import java.util.Arrays;
import java.util.Scanner;

public class Combinaciones {
    
    /**
     * Métoo para calcular el número de combinaciones posibles en un grupo de elementos, 
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
     * Método para calcular el factorial de un número
     * @param numeroACalcular - Número a calcular su factorial
     * @return - Factorial de un número
     */
    public static int calcularFactorial(int numeroACalcular) {
		int resultado;
		if (numeroACalcular < 0) {
			//System.out.println("El numero ingresado no permite calcular el factorial, debe ser un numero positivo");
			return 0;
		}else if(numeroACalcular == 1 || numeroACalcular == 0) {
			return 1;
		}else {
			resultado = numeroACalcular * calcularFactorial(numeroACalcular-1);
			return resultado;
		}
	}


    public static void main(String[] args) {
       //Definición de variables y Scanner
        Scanner sc = new Scanner(System.in);
        String [] elementos = {"a", "b", "c" , "d", "e"};
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

        //Calculo de las combinaciones posibles
        int combinaciones = calcularCombinaciones(nFactorial, kFactorial, nMenosKFactorial);

            if(elementGrupos == 0){
                System.out.println("No se puede hacer combinaciones de 0 elementos");
            }else{
                if(elementGrupos <= numElementos && elementGrupos > 0)
                    System.out.println("El numero de combinaciones posibles en grupos de " + elementGrupos + " es " + combinaciones);
            }    
        }else{
            System.out.println("*ERROR*, no puedes calcular combinaciones en grupos de más elementos que los que hay en el grupo principal");
        }
    }

    
}

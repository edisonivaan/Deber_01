import java.util.Scanner;
public class Escalera {

    /**
     * Este método permite crear una escalera con un número de escalones
     * ingresado por consola
     * @param numEsca - número ingresado por consola
     */
    public static void dibujarEscalera(int numEsca) {
        //Este for permite dibujar los caracteres el número de veces que indique el número ingresado por consola
        for(int i = 0 ; i < numEsca ; i++ ){
            //Este for permite crear los espacios debajo de las líneas horizontales
            for(int j = 0 ; j < i ; j++ )
                System.out.print("   ");
            //Este if permite escribir la linea vertical después de escribir las primeras líneas horizontales
            if(i>0)
                System.out.print("┤");
            System.out.println("__");
        }
    }

    public static void main(String[] args) {

        //Definición de variables y Scanner
        Scanner sc = new Scanner(System.in);

        //Se solicita al usuario la cantidad de escalones que tener la escalera
        System.out.println("Digite la cantidad de escalones que desea que tenga la escalera");
        int numEsca = sc.nextInt();

        //Método para dibujar la escalera con caracteres
        dibujarEscalera(numEsca);
        sc.close();
    }
}
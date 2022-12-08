import java.util.Scanner;

public class Escalera {
    public static void main(String[] args) {

        //Definición de variables y Scanner
        Scanner sc = new Scanner(System.in);

        //Se solicita al usuario la cantidad de escalones que tener la escalera
        System.out.println("Digite la cantidad de escalones que desea que tenga la escalera");
        int numEsca = sc.nextInt();

        for(int i=0; i<numEsca; i++){
            for(int j=0; j<i;j++)
                System.out.print("   ");
            if(i>0)
                System.out.print("┤");
            System.out.println("__");
        }   


    }
}

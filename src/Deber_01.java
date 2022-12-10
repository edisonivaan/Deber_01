import java.util.Arrays;
import java.util.Scanner;
public class Deber_01 {
	public static void main(String[] args) {
		int [] inicioIzqui = {1, 1, 1, 1}; 
		int [] finDerecha = {0, 0, 0, 0};
		Scanner ingresoDatos = new Scanner(System.in);
		System.out.println("A continuacion, para resolver el juego se le solicitara los movimientos que desee realizar, usted será el observador y conductor de la canoa");
		System.out.println("No puedde hacer movimientos repetitivos, es decir moverse de un lugar a otro y regresar con lo mismo que llevó, caso contrario perderá");
		System.out.println("Puede cambiarse de lado usted solo(escriba 0)");
		System.out.println("Puede mover la uva de lado (escriba 1)");
		System.out.println("Puede mover a la caperucita de lado (escriba 2)");
		System.out.println("Puede mover al lobo de lado (escriba 3)");
		int opcion = ingresoDatos.nextInt();
		if(opcion ==0) {
			inicioIzqui[3] = inicioIzqui[3] - 1;
			finDerecha[3] = finDerecha[3] + 1;
			System.err.println("***PERDIÓ***, La caperucita se comio las uvas y el lobo a la caperucita");
		}else if(opcion==1) {
			System.err.println("Ha perdido, el lobo se ha comido a la caperucita");
		}else if(opcion==2) {
			finDerecha[1] = finDerecha[1] + 1;
			inicioIzqui[1] = inicioIzqui[1] - 1;
			finDerecha[3] = finDerecha[3] + 1;
			inicioIzqui[3] = inicioIzqui[3] - 1;
			System.out.println("¿Que desea hacer?, está al lado derecho");
			System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
			System.out.println("Puede mover a la caperucita de lado (escriba 1)");
			int opc1 = ingresoDatos.nextInt();
			if(opc1 ==0) {
				inicioIzqui[3] = inicioIzqui[3] + 1;
				finDerecha[3] = finDerecha[3] - 1;
				System.out.println("¿Que desea hacer?, está al lado izquierdo");
				System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
				System.out.println("Puede mover a las uvas de lado (escriba 1)");
				System.out.println("Puede mover al lobo de lado (escriba 2)");
				int opc2 = ingresoDatos.nextInt();
				if(opc2==0) {
					System.out.println("Perdió, esta haciendo movimientos repetitivos seguidos");
				}else if(opc2==1) {
					inicioIzqui[2] = inicioIzqui[2] - 1;
					finDerecha[2] = finDerecha[2] + 1;
					inicioIzqui[3] = inicioIzqui[3] - 1;
					finDerecha[3] = finDerecha[3] + 1;
					System.out.println("¿Que desea hacer?, está al lado derecho");
					System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
					System.out.println("Puede mover a las uvas de lado (escriba 1)");
					System.out.println("Puede mover a la caperucita de lado (escriba 2)");
					int opc3 = ingresoDatos.nextInt();
					if(opc3==0) {
						System.err.println("Ha perdido, la caperucita se comio las uvas");
					}else if(opc3==1) {
						System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
					}else if(opc3==2) {
						inicioIzqui[1] = inicioIzqui[1] + 1;
						finDerecha[1] = finDerecha[1] - 1;
						inicioIzqui[3] = inicioIzqui[3] + 1;
						finDerecha[3] = finDerecha[3] - 1;
						System.out.println("¿Que desea hacer?, está al lado izquierdo");
						System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
						System.out.println("Puede mover al lobo de lado (escriba 1)");
						System.out.println("Puede mover a la caperucita de lado (escriba 2)");
						int opc4 = ingresoDatos.nextInt();
						if(opc4==0) {
							System.err.println("Ha perdido, el lobo se ha comido a la caperucita");
						}else if(opc4==1) {
							inicioIzqui[0] = inicioIzqui[0] - 1;
							finDerecha[0] = finDerecha[0] + 1;
							inicioIzqui[3] = inicioIzqui[3] - 1;
							finDerecha[3] = finDerecha[3] + 1;
							System.out.println("¿Que desea hacer?, está al lado derecho");
							System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
							System.out.println("Puede mover al lobo de lado (escriba 1)");
							System.out.println("Puede mover a las uvas de lado (escriba 2)");
							int opc5 = ingresoDatos.nextInt();
							if(opc5==0) {
								inicioIzqui[3] = inicioIzqui[3] + 1;
								finDerecha[3] = finDerecha[3] - 1;
								System.out.println("¿Que desea hacer?, está al lado izquierdo");
								System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
								System.out.println("Puede mover a la caperucita de lado (escriba 1)");
								int opc6 = ingresoDatos.nextInt();
								if(opc6==0) {
									inicioIzqui[3] = inicioIzqui[3] - 1;
									finDerecha[3] = finDerecha[3] + 1;	
								}else if(opc6==1) {
									inicioIzqui[3] = inicioIzqui[3] - 1;
									finDerecha[3] = finDerecha[3] + 1;
									inicioIzqui[1] = inicioIzqui[1] - 1;
									finDerecha[1] = finDerecha[1] + 1;
									System.out.println("El arreglo que representa al lado derecho del río es" + Arrays.toString(finDerecha));
									System.out.println("El arreglo que representa al lado izquierdo del río es" + Arrays.toString(inicioIzqui));
									System.out.println("FELICIDADES, ha resuelto correctamente el juego. Ha movido a todos al lado derecho del río");
								}
							}else if(opc5==1) {
								inicioIzqui[0] = inicioIzqui[0] + 1;
								finDerecha[0] = finDerecha[0] - 1;
								inicioIzqui[3] = inicioIzqui[3] + 1;
								finDerecha[3] = finDerecha[3] - 1;
							}else if(opc5==2) {
								inicioIzqui[2] = inicioIzqui[2] + 1;
								finDerecha[2] = finDerecha[2] - 1;
								inicioIzqui[3] = inicioIzqui[3] + 1;
								finDerecha[3] = finDerecha[3] - 1;
							}
						}else if(opc4==2) {
							System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
						}
					}
				}else if(opc2==2) {
					inicioIzqui[0] = inicioIzqui[0] - 1;
					finDerecha[0] = finDerecha[0] + 1;
					inicioIzqui[3] = inicioIzqui[3] - 1;
					finDerecha[3] = finDerecha[3] + 1;
					System.out.println("¿Que desea hacer?, está al lado derecho");
					System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
					System.out.println("Puede mover a la caperucita de lado (escriba 1)");
					System.out.println("Puede mover al lobo de lado (escriba 2)");
					int opc7 = ingresoDatos.nextInt();
					if(opc7==0){
						System.out.println("Perdió, el lobo se comió a la caperucita");
					}else if(opc7==1){
						inicioIzqui[1] = inicioIzqui[1] + 1;
						finDerecha[1] = finDerecha[1] - 1;
						inicioIzqui[3] = inicioIzqui[3] + 1;
						finDerecha[3] = finDerecha[3] - 1;
						System.out.println("¿Que desea hacer?, está al lado izquierdo");
						System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
						System.out.println("Puede mover a la caperucita de lado (escriba 1)");
						System.out.println("Puede mover las uvas de lado (escriba 2)");
						int opc8 = ingresoDatos.nextInt();
						if(opc8==0){
							System.out.println("Perdió, la caperucita se comió las uvas");
						}else if(opc8==1){
							System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
						}else if(opc8==2){
							inicioIzqui[2] = inicioIzqui[2] - 1;
							finDerecha[2] = finDerecha[2] + 1;
							inicioIzqui[3] = inicioIzqui[3] - 1;
							finDerecha[3] = finDerecha[3] + 1;
							System.out.println("¿Que desea hacer?, está al lado derecho");
							System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
							System.out.println("Puede mover al lobo de lado (escriba 1)");
							System.out.println("Puede mover las uvas de lado (escriba 2)");
							int opc9 = ingresoDatos.nextInt();
							if(opc9==0){
								inicioIzqui[3] = inicioIzqui[3] + 1;
								finDerecha[3] = finDerecha[3] - 1;
								System.out.println("¿Que desea hacer?, está al lado izquierdo");
								System.out.println("Puede cambiarse de lado usted solo (escriba 0)");
								System.out.println("Puede mover a la caperucita de lado (escriba 1)");
								int opc10 = ingresoDatos.nextInt();
								if(opc10==0){
									System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
								}else if(opc10==1){
									inicioIzqui[1] = inicioIzqui[1] - 1;
									finDerecha[1] = finDerecha[1] + 1;
									inicioIzqui[3] = inicioIzqui[3] - 1;
									finDerecha[3] = finDerecha[3] + 1;
									System.out.println("El arreglo que representa al lado derecho del río es" + Arrays.toString(finDerecha));
									System.out.println("El arreglo que representa al lado izquierdo del río es" + Arrays.toString(inicioIzqui));
									System.out.println("FELICIDADES, ha resuelto correctamente el juego. Ha movido a todos al lado derecho del río");
								}
							}else if(opc9==1){
								System.out.println("Su decisión no tiene sentido, la solución estuvo a un paso. *PIERDE");
							}else if(opc9==2){
								System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
							}
						}
					}else if(opc7==2){
						System.out.println("Perdió, está haciendo movimientos repetitivos seguidos");
					}
				}
			}else if(opc1==1) {
				System.out.println("Perdió, solo está haciendo movimientos repetitivos seguidos");
			}
		}else if(opcion==3) {
			System.err.println("Ha perdido, la caperucita se comio las uvas");
		}
		ingresoDatos.close();
	}
}
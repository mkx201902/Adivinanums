package paq;
import java.util.Scanner;
class AdivinaNums {
	public static void main(String[] args) {
	//declaro variable numerica acierto y variable boolean aciertovalido	
	int acierto, segundos;
	boolean aciertoValido, segundosV;
	//inicializo variable numerica
	acierto=0;
	segundos=0;
	
	
	//invoco el método de obtención de variable por teclado
	Scanner teclado = new Scanner( System.in );
	System.out.println("Introduce el número de aciertos");
	acierto = teclado.nextInt();
	NumsPosi numeroPositivo1=new NumsPosi();
	numeroPostivo1.setAcierto(acierto);
	System.out.println("Introduce el número de segundos");
	segundos = teclado.nextInt();
	NumsPosi numeroPositivo2=new NumsPosi();
	numeroPostivo2.setSegundos(segundos);
	
	/**invoco un bucle de obtención de número positivo para la variable acierto
	do	{
		System.out.println("Introduce el número de aciertos");
		acierto = teclado.nextInt();
		aciertoValido = acierto>0;
				if (!aciertoValido)
			System.out.println("Error, intentalo otra vez\n");
		}while (!aciertoValido); //fin repetir-mientras
	do	{
		System.out.println("¿En cuánto tiempo(en segundos)?");
		segundos = teclado.nextInt();
		segundosV=segundos>0;
				if (!segundosV)
			System.out.println("Error, intentalo otra vez\n");
		}while (!segundosV); //fin repetir-mientras
	*/
		

	}

}

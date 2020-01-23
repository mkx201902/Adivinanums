package paq;

import java.io.InputStream;
import java.util.*;

public class AdivinaUno {
	
	
	public static void main(String[] args) {
		
		int acierto, segundos,izq1, dch1;
		boolean aciertoValido, segundosV,izqb,dchb, izqi,dchi;
		acierto=0;
		segundos=0;
		aciertoValido=true;
		izqi=true;
		dchi=true;
		Scanner teclado = new Scanner( System.in );
		
		//invoco un bucle de obtención de número positivo para la variable acierto
		
		
		do	{
			
				//invoco un bucle de obtención de número positivo para la variable acierto
			System.out.println("Introduce el número de aciertos");
			acierto = teclado.nextInt();
			aciertoValido = acierto>0;
					if (!aciertoValido)
				System.out.println("Error, intentalo otra vez\n");
			
			}while (!aciertoValido); //fin repetir-mientras
		
			//invoco un bucle de obtención de número positivo para la variable acierto
		do	{
			
			System.out.println("¿En cuánto tiempo(en segundos)?");
			segundos = teclado.nextInt();
			segundosV=segundos>0;
					if (!segundosV)
				System.out.println("Error, intentalo otra vez\n");
			
			}while (!segundosV); //fin repetir-mientras
	//do{//inicio del bucle de comprobacion de las condiciones del intervalo	
	
		do	{
			System.out.println("El numero inferior del intervalo numerico porfavor");
			izq1= teclado.nextInt();
			izqb=izq1>0;
					if (!izqb)
				System.out.println("Error, intentalo otra vez\n");
			
			}while (!izqb); //fin repetir-mientras
		
		do	{
			System.out.println("El numero superior del intervalo numerico, con 30 uds más, porfavor");
			dch1= teclado.nextInt();
			dchb=dch1>(izq1+30);
					if (!dchb)
				System.out.println("Error, intentalo otra vez\n");
				}while (!dchb); //fin repetir-mientras
		System.out.println(".............................Empecemos.................................\n");	
		System.out.println("En "+segundos+" segundos, deberás acertar "+acierto+" números, entre el "+
	  izq1+" y el "+dch1+" .\n");
		try {
			Thread.sleep(1*1000);
			System.out.println("....¡¿preparados?!....\n");  //Ponemos a "Dormir" el programa durante los ms que queremos
		   Thread.sleep(1*1000);
		   System.out.println("....¡¿listos?!....\n");  //Ponemos a "Dormir" el programa durante los ms que queremos
		   Thread.sleep(1*1000);
		   System.out.println("....¡¡ya!!....\n");  //Ponemos a "Dormir" el programa durante los ms que queremos
		 	}
		catch (Exception e) {
		   System.out.println(e);
		}
			
//		Random random = new Random();
			
	//		int random= (int) (Math.random() *dch1 + izq1);// Genera números aleatorios entre el 1 y 21
		//	System.out.println("aleatorio "+random);
		
	//Generador de numeros aleatorios
	int[] tabla=new int[acierto];
	Random rnd=new Random();
	int i,  x, numac, estaenarray;
		for(i=0;i<acierto;i++)	{
		x=(int)(rnd.nextDouble()*dch1+1);
		tabla[i]=x;
		System.out.println(tabla[i]);}
	
do {		
		numac=teclado.nextInt();
		int numa= estaenarray(tabla, numac);
		if (numa==-1) {
	    System.out.println("Has fallado, intentalo otra vez.");
	}else System.out.println("Enhorabuena,has acertado. "+numa);
}while(numac>0);	
	
	
	
	
	/**for(i=0;i<acierto-1;i++)
		{
			for (j=0;j<acierto-i-1;j++)
			{
				if(tabla[j]>tabla[j+1])
				{
					aux=tabla[j];
					tabla[j]=tabla[j+1];
					tabla[j+1]=aux;
				}
					
	
	
	/**for(i=0;i<acierto-1;i++)
		{
			for (j=0;j<acierto-i-1;j++)
			{
				if(tabla[j]>tabla[j+1])
				{
					aux=tabla[j];
					tabla[j]=tabla[j+1];
					tabla[j+1]=aux;
				}
				
			}
		}
		
		for (i=0;i<tabla.length;i++)
		System.out.println("tabla["+i+"]="+tabla[i]);*/
}

	private static int estaenarray(int[] tabla, int numac) {
		// TODO Auto-generated method stub
		return 0;}
			
		
		
}


	



	



	
	
	
	
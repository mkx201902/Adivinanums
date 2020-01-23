package paq;

import java.util.*;

class NumsPosi {
	
		//declaro variables numericas y booleanas	
		int acierto, segundos;
		boolean aciertoValido, segundosV;
			//inicializo variable numerica

	public NumsPosi	(int acierto) {
		this.acierto =acierto;}
	//invoco getter y setter
		public int getAcierto() {
		return acierto;	}
		public void setAcierto(int acierto) {
		this.acierto = acierto;	}
	
		public NumsPosi (int segundos) {
		this.segundos =segundos;}
	//invoco getter y setter
		public int getSegundos() {
		return segundos;	}
		
	public void setSegundos(int segundos) {
		this.segundos= segundos;
		}
		
		//bucle de advertencia sobre las letras

			//invoco un bucle de obtención de número positivo para la variable acierto
			do	{	aciertoValido = getAcierto()>0;
					if (!aciertoValido)
				System.out.println("Error, intentalo otra vez\n");
			}while (!aciertoValido); //fin repetir-mientras
			try {
		}catch (InputMismatchException e) {
			
			
			/**
			System.out.println("No se admiten letras o caracteres raros");
		do	{				
			segundosV = getSegundos()>0;
					if (!segundosV)
				System.out.println("Error, intentalo otra vez\n");
			}while (!segundosV); //fin repetir-mientras
		}*/
	}
}
}

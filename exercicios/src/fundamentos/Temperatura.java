package fundamentos;

public class Temperatura {
	
		public static void main(String[] args) {
			// (°F-32) x 5/9.0 = °C
			
			final double FATOR = 5.0 / 9.0;
			final double AJUSTE = 32;
			
			double fahrenheit = -90;
			final double celsius = (fahrenheit - AJUSTE) * FATOR;
			System.out.println("o Resultado é +" + celsius + "°C." );
			
			fahrenheit = 150; 
			
			
			
			
		}
}

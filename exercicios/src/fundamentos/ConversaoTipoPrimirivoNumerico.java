package fundamentos;

public class ConversaoTipoPrimirivoNumerico {
	
		public static void main(String[] args) {
			
			// Conversão implicita
			double a = 1;
			System.out.println(a);
			
			// conversão explicita (CAST)
			float b = (float) 1.0;
			
			int c = 4;
			byte d = (byte) c;
			
			System.out.println(b);
			System.out.println(d);
			
			double e = 1.0;
			int f = (int) e;
			System.out.println(f);
			
			
		}

}

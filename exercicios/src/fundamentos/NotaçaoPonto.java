package fundamentos;

public class NotaçaoPonto {
	
		public static void main(String[] args) {
			
			String s = "Bom dia X";
			s = s.replace("X","Amanda");
			s = s.toUpperCase();
			s = s.concat(" !!!");
			
			System.out.println(s);
			
			String x = "Capivara".toUpperCase();
			System.out.println(x);
			
			String y = "Salve X"
					.replace("X","Luiz")
					.toUpperCase()
					.concat(" !!! ");
			System.out.println(y);
			
			// Tipos primitivos não tem operador "."
			
		}

}

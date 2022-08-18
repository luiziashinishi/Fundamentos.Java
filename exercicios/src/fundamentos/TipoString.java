package fundamentos;

public class TipoString {
	
		public static void main(String[] args) {
			System.out.println("Olá pessoal".charAt(5));
			
			String s = "boa tarde";
			s = s.toUpperCase();
			System.out.println(s.concat(" !!! "));
			System.out.println(s + " !!! " );
			System.out.println(s.toLowerCase().startsWith("boa"));
			System.out.println(s.toUpperCase().endsWith("TARDE"));			 
			System.out.println(s.length());
			System.out.println(s.equals("boa tarde"));
			System.out.println(s.equalsIgnoreCase("boa tarde"));
			
			var nome = "Luiz";
			var sobrenome = "Iashinishi";
			var idade = 20;
			var salario = 2000;
			
			System.out.println("nome: " + nome + 
					"\nSobrenome: " + sobrenome + 
					"\nIdade: " + idade + 
					"\nSalario: " + salario);
			
			
		}

}

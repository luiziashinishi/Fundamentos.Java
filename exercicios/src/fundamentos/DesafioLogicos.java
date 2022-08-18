package fundamentos;

public class DesafioLogicos {
	
		public static void main(String[] args) {
			// Trabalho na terça (V ou F)
			// Trabalho na quinta (V ou F)
			
			// 1 trabalho 32
			// 2 trabalhos 50
			// idependente tomar sorvete
			// 0 trabalho igual sem tv e sem sorvete
			
			boolean trabalho1 = true;
			boolean trabalho2 = false;
			
			boolean comprou50 = trabalho1 && trabalho2;
			boolean comprou32 = trabalho1 ^ trabalho2;
			boolean comprouSorvete = trabalho1 || trabalho2;
			
			// Operador Unário 
			boolean maisSaudavel = !comprouSorvete;
			
			System.out.println("comprou TV 50\"? " + comprou50);
			System.out.println("comprou TV 32\"? " + comprou32);
			System.out.println("comprou TV 32\"Sorvete? " + comprou32);
			System.out.println(("Mais Saudável ? " + maisSaudavel));
			
		}

}

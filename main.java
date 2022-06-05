package pessoa;
import java.util.Scanner;
public class main {
	private static int op;

	public static void main(String args[]) {
		
		
		obijeto amigo = new obijeto();
		Scanner escreva = new Scanner(System.in);
		
		System.out.print("digite o nome do seu amigo: ");
		String nome = escreva.nextLine();
		System.out.print("digite o telefone do seu amigo: ");
		String telefone = escreva.nextLine();
		
		amigo.setNome(nome);
		amigo.setTelefone(telefone);
		
		System.out.println(".........................................................");
		amigo.saida();
		System.out.println(".........................................................");
		
		// para trocar o telefone usamos sobrecarga de metodosll98 koik
		
		
		System.out.print("digite o novo telefone do seu amigo: ");
		String telefoneNovo = escreva.nextLine();
		amigo.novoFone(telefoneNovo);
		System.out.println(".........................................................");
		
		amigo.novoFone();
		System.out.println(".........................................................");

	
		
	}

}

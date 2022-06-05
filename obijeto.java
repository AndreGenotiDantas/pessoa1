package pessoa;
public class obijeto {
	
	private String nome;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void novoFone(String f) {
		telefone = f;
		System.out.println("o telefone foi trocado"); 
	}
	
	
	public void novoFone() {
		System.out.println("o novo telefone e "+telefone);
	}
	
	
	public void saida() {
		System.out.println("o nome do amigo e "+getNome());
		System.out.println("o telefone do amigo e "+getTelefone());
		
	}

}

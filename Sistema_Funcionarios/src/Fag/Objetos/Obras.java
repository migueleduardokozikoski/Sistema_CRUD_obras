package Fag.Objetos;

public class Obras {
	private String nome_obra;
	private String endereco_obra;
	private String data_obra;
	
	public Obras() {
		
	}
	
	public Obras(String endereco_obra, String nome_obra,String data_obra) {
		setNome_obra(nome_obra);
		setEndereco_obra(endereco_obra);
		setData_obra(data_obra);
	}
	

	public String getNome_obra() {
		return nome_obra;
	}
	
	public void setNome_obra(String nome_obra) {
		if(nome_obra != null && !nome_obra.isBlank()) {
			this.nome_obra = nome_obra;
		}else {
			System.out.println("digite o nome da obra!!!");
		}
	}
	
	public String getEndereco_obra() {
		return endereco_obra;
	}
	
	public void setEndereco_obra(String endereco_obra) {
		if (endereco_obra != null && !endereco_obra.isBlank()) {
			this.endereco_obra=endereco_obra;
		}else{
			System.out.println("digite o endereço da obra!!!");
		}
	}
	
	public String getData_obra() {
		return data_obra;
	}
	
	public void setData_obra(String data_obra) {
		if (data_obra != null) {
			this.data_obra = data_obra;
		}else {
			System.out.println("digite a data da obra!!!");
		}
	}
}

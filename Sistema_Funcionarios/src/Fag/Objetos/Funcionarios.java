package Fag.Objetos;

public class Funcionarios {
	private String nome;
	private String cargo;
	private double salario;
	private int idade;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome,String cargo, double salario,int idade) {
		setNome(nome);
		setCargo(cargo);
		setSalario(salario);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && nome.isBlank()) {
			this.nome= nome;
		}else {
			System.out.println("digite o nome !!!");
		}
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		if(cargo != null && cargo.isBlank()) {
			this.cargo =cargo;
		}else {
			System.out.println("digite o cargo do funcionario !!!");
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario= salario;
		}else {
			System.out.println("digite o salario !!!");
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if( idade >= 0) {
			this.idade= idade;
		}else {
			System.out.println("digite a idade do funcionario !!!");
		}
	}
}

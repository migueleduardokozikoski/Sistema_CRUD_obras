package Fag;

import Fag.Objetos.Obras;
import Fag.Objetos.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static List<Obras> obrasAdicionadas = new ArrayList <>();
	//static List<Funcionario> funcionarios = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		mostramenu();
		obrasAdicionadas();
	}
	
	public static void mostramenu() {
		int escolha = -1;
		do {
		System.out.println("-----Bem-vindos a construtora 3k-----");
		System.out.println("você vai começar uma nova construção em Cascavel?");
		System.out.println("digite uma opção abaixo");
		System.out.println("1-cadastrar nova obra");
		System.out.println("2-cadastrar novo funcionario");
		System.out.println("3-remover funcionario");
		System.out.println("4-finalizar obra");
		System.out.println("0-sair");
		System.out.println("---------------------");
		escolha = scan.nextInt();
		scan.nextLine();
		Validarescolha(escolha);
		}while(escolha != 0);
	}
	
	public static void Validarescolha(int escolha) {
		switch(escolha) {
		case 1:
			cadastroObra();
			break;
		case 2:
			cadastroFuncionario();
			break;
		case 3:
	//		removerFuncioanrio();
			break;
		case 4:
	//		finalizarObra();
			break;
		default:
			System.out.println("digite uma opção valida!");
		break;
		}
	}
	
	public static void cadastroObra() {
		Obras obras = new Obras();
		System.out.println("digite o nome da obra:");
		obras.setNome_obra(scan.nextLine());
		System.out.println("digite o endereço da obra:");
		obras.setEndereco_obra(scan.nextLine());
		System.out.println("digite a data de ínicio da obra:");
		obras.setData_obra(scan.nextLine());
		obrasAdicionadas.add(obras);
		System.out.println("obras adicionada com sucesso!");
	}
	public static void cadastroFuncionario() {
		Funcionarios funcionario = new Funcionarios();
		System.out.println("digite o cargo do novo funcionario:");
		funcionario.setCargo(scan.nextLine());
		System.out.println("digite o o nome do funcionairo:");
		funcionario.setNome(scan.nextLine());
		System.out.println("digite a idade do funcioanrio:");
		funcionario.setIdade(scan.nextInt());
		System.out.println("digite o salario do funcionairo:");
		funcionario.setSalario(scan.nextDouble());
		scan.nextLine();
//		funcionario.add(funcionario);
		System.out.println("obras adicionada com sucesso!");
	}
	
	public static void obrasAdicionadas(){
		Obras obrasum = new Obras("hotal palace","rua marechal rondon","18/07");
		Obras obrasdois = new Obras("hotal ligas","avenida Brasil","06/10");
		Obras obrastres = new Obras("hotal magestade real","rua tres vizinhos","7/12");
		obrasAdicionadas.add(obrasum);
		obrasAdicionadas.add(obrasdois);
		obrasAdicionadas.add(obrastres);
	}
}

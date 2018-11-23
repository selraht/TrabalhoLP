import java.util.ArrayList;
import java.util.Scanner;
public class Colegio {

ArrayList<Professor> professores = new ArrayList<Professor>(); 
	
	public void CadastrarProfessor(){
		
		Scanner Nome= new Scanner(System.in);
		Scanner Endereco = new Scanner(System.in);
		Scanner Email = new Scanner(System.in);
		
		Professor professor = new Professor();
		
		System.out.println("Informe o nome do Professor: ");
		professor.setNome(Nome.next());
		
		System.out.println("Informe o endereco do Professor: ");
		professor.setEndereco(Endereco.nextLine());

		System.out.println("Informe o email do Professor: ");
		professor.setEmail(Email.nextLine());
		
		professores.add(professor);                              
		
	}
	
	public void listarProfessores(){
		Scanner f = new Scanner(System.in);
		int i=0;
		
		professores.size();
		
		for(i=0; i<professores.size(); i++){
			System.out.println(i+1 +"-"+ professores.get(i));
			
		}
		
		
	}
	
	public void removerProfessor(){
		Scanner e = new Scanner(System.in);
		listarProfessores();
		
		
		System.out.println("Informe o Indice que deseja remover: ");
		professores.remove(e.nextInt()-1);
		System.out.println("\nProfessor Removido: ");
		
		
	
	}
	
	public void alterarProfessor(){
		
		Scanner Nome= new Scanner(System.in);
		Scanner Endereco = new Scanner(System.in);
		Scanner Email = new Scanner(System.in);
		Scanner indice = new Scanner(System.in);
		
		
		listarProfessores();
		
		System.out.println("Informe o Indice do Professor que desejar alterar:  ");
	
		int i = indice.nextInt()-1;
			
		Professor professor = (Professor) professores.get(i);

		
		System.out.println("Informe o nome do Professor: ");
		professor.setNome(Nome.next());
		
		System.out.println("Informe o endereco do Professor: ");
		professor.setEndereco(Endereco.nextLine());

		System.out.println("Informe o email do Professor: ");
		professor.setEmail(Email.nextLine());
		
		System.out.println("\nProfessor foi Alterado: ");
		
	}
	
}

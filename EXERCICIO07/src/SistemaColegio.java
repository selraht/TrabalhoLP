import java.util.Scanner;

public class SistemaColegio {

	public static void main(String[] args) {
		int opção;
		Colegio colegio= new Colegio();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Professores de uma Instuição\n");
			System.out.println("1-Cadastrar Professor \n2-Listar Professor \n3-Remover Professor \n4-Alterar Professor");
			opção =e.nextInt();
			switch( opção )
			{
			    case 1:
			    	colegio.CadastrarProfessor();  
			            break;
			    
			    case 2:
			    	colegio.listarProfessores();
			            break;
			    
			    case 3:
			    	colegio.removerProfessor();
			            break;
			    case 4:
			    	colegio.alterarProfessor();
		            	break;
		            	
			    default:
			           
			}
		
		}while(opção<5);
		
	}

}

import java.util.Scanner;

public class SistemaColegio {

	public static void main(String[] args) {
		int op��o;
		Colegio colegio= new Colegio();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Professores de uma Instui��o\n");
			System.out.println("1-Cadastrar Professor \n2-Listar Professor \n3-Remover Professor \n4-Alterar Professor");
			op��o =e.nextInt();
			switch( op��o )
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
		
		}while(op��o<5);
		
	}

}

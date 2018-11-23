
import java.util.Scanner;

public class SisTHLVeiculos {
    
    public static void main(String[] args) {
        
        SisGerencVei objCadCadVei = new SisGerencVei();
        Scanner input = new Scanner(System.in);
       
        int opt;
        
        
        do{
            System.out.printf("\n\t\t%s ","Bem vindo a TH Veiculos\n\n");
            System.out.print("Digite o tipo de serviço:\n");
            System.out.println("[1]-Gerenciamento de Carros");
            System.out.println("[2]-Gerenciamento de Motos");
            System.out.print("Digite uma opção para continuar: ");
            opt = input.nextInt();
            
            switch(opt){
                case 1:
                    System.out.printf("\t\t%s ","Bem vindo ao serviço de atendimento de Carros\n");
                    System.out.println("[1]-Cadastrar Carro");
                    System.out.println("[2]-Listar Carros");
                    System.out.println("[3]-Alterar Carro");
                    System.out.println("[4]-Remover Carro");
                    
                    System.out.print("Digite uma opção para continuar:");
                    opt = input.nextInt();
                    switch(opt){
                        case 1:
                            objCadCadVei.cadCarro();
                        break;
                        
                        case 2:
                            objCadCadVei.listCarro();
                        break;
                        
                        case 3:
                            objCadCadVei.alterCarro();
                        break;
                        
                        case 4:
                            objCadCadVei.remCarro();
                        break;
                        
                    }
                break;
                   
                case 2:
                    System.out.printf("\t\t%s ","Bem vindo ao serviço de atendimento de Motocicletas\n");
                    System.out.println("[1]-Cadastrar Motocicletas ");
                    System.out.println("[2]-Listar Motocicletas");
                    System.out.println("[3]-Alterar Motocicletas");
                    System.out.println("[4]-Remover Motocicletas");
                    
                    System.out.print("Digite uma opção para continuar:");
                    opt = input.nextInt();
                    switch(opt){
                        case 1:
                            objCadCadVei.cadMoto();
                        break;
                        
                        case 2:
                            objCadCadVei.listMoto();
                        break;
                        
                        case 3:
                            objCadCadVei.alterMoto();
                        break;
                        
                        case 4:
                            objCadCadVei.remMoto();
                        break;
                        
                    }
                break;
                
                case 3:
                    
                break;
                
                default:
                    System.out.print("OPÇÃO INVALIDA!!");
                break;
            }
            
        }while(opt !=0);
        
        
    }
    
}

import java.util.ArrayList;
import java.util.Scanner;

public class SisGerencVei {
    ArrayList<Veiculo> vetSisCadVei = new ArrayList<Veiculo>();
       
    public void cadCarro(){
       
        Carro objCarro = new Carro();
                    
        Scanner input = new Scanner(System.in);
      
        objCarro.setTipo(1);
        
        System.out.print("Informe a placa do veiculo: ");
        objCarro.setPlaca(input.nextLine()); 
        
        System.out.print("Informe o modelo do veiculo : ");
        objCarro.setModelo(input.nextLine()); 
        
        System.out.print("Informe o ano do veiculo: ");
        objCarro.setAno(input.nextLine());
        
        System.out.print("Informe a quantidade de Portas do veiculo : ");
        objCarro.setQuantPortas(input.next());
        
        vetSisCadVei.add(objCarro);
    }
    
    public void listCarro(){
        Scanner leia = new Scanner(System.in);
        
        for(int i=0; i<vetSisCadVei.size(); i++){
            Veiculo objVeiculo = vetSisCadVei.get(i);
            if(objVeiculo.getTipo()==1){
                System.out.println((i+1)+"-"+ vetSisCadVei.get(i));
            }
        }
        System.out.print("Pressione ENTER para continuar...");
        leia.nextLine();
    }
    
    public void alterCarro(){
        Scanner input = new Scanner(System.in);
  
        listCarro();
        
        System.out.println("Informe o Indice do veiculo que desejar alterar:  ");
        int i = input.nextInt();
        i--;
    
        Carro objCarro = (Carro) vetSisCadVei.get(i);
    
        System.out.print(objCarro.getPlaca()+ ", modificar para: ");
        objCarro.setPlaca(input.next());
    
        System.out.print(objCarro.getModelo()+ ", modificar para: ");
        objCarro.setModelo(input.nextLine());
        
        System.out.print(objCarro.getAno()+ ", modificar para: ");
        objCarro.setAno(input.next());
        
        
        System.out.print(objCarro.getQuantPortas()+ ", modificar para: ");
        objCarro.setQuantPortas(input.next());
        
        
    
        System.out.printf("\n Veiculo: %d  Alterado com sucesso!",++i); 
    }
        

    public void remCarro(){
        Scanner input = new Scanner(System.in);
        listCarro();
        
        System.out.println("Informe o Indice do veiculo que deseja remover: ");
        vetSisCadVei.remove(input.nextInt()-1);
                
        System.out.println("\nVeiculo removido do sistema!");
    }

public void cadMoto(){
       
        Motocicleta objMoto = new Motocicleta();
                    
        Scanner input = new Scanner(System.in);
      
        objMoto.setTipo(2);
        
        System.out.print("Informe a placa do veiculo: ");
        objMoto.setPlaca(input.nextLine()); 
        
        System.out.print("Informe o modelo do veiculo : ");
        objMoto.setModelo(input.nextLine()); 
        
        System.out.print("Informe o ano do veiculo: ");
        objMoto.setAno(input.nextLine());
        
        System.out.print("Informe o tipo do painel : ");
        objMoto.setTipoPainel(input.nextLine());
        
        vetSisCadVei.add(objMoto);
    }
    
    public void listMoto(){
        Scanner leia = new Scanner(System.in);
        
        for(int i=0; i<vetSisCadVei.size(); i++){
            Veiculo objVeiculo = vetSisCadVei.get(i);
            if(objVeiculo.getTipo()==2){
                System.out.println((i+1)+"-"+ vetSisCadVei.get(i));
            }
        }
        System.out.print("Pressione ENTER para continuar...");
        leia.nextLine();
    }
    
    public void alterMoto(){
        Scanner input = new Scanner(System.in);
  
        listMoto();
        
        System.out.println("Informe o Indice do veiculo que desejar alterar:  ");
        int i = input.nextInt();
        i--;
    
        Motocicleta objMoto = (Motocicleta) vetSisCadVei.get(i);
    
        System.out.print(objMoto.getPlaca()+ ", modificar para: ");
        objMoto.setPlaca(input.next());
    
        System.out.print(objMoto.getModelo()+ ", modificar para: ");
        objMoto.setModelo(input.nextLine());
        
        System.out.print(objMoto.getAno()+ ", modificar para: ");
        objMoto.setAno(input.next());
        
        System.out.print(objMoto.getTipoPainel()+ ", modificar para: ");
        objMoto.setTipoPainel(input.next());
        
        System.out.printf("\n Chamado: %d  Alterado com sucesso!",++i); 
    }
        
    public void remMoto(){
        Scanner input = new Scanner(System.in);
        listMoto();
        
        System.out.println("Informe o Indice do veiculo que deseja remover: ");
        vetSisCadVei.remove(input.nextInt()-1);
                
        System.out.println("\nVeiculo removido do sistema!");
    }    
}

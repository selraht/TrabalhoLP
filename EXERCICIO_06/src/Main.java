
public class Main {

	public static void main(String[] args) {
		
            Professor prof = new Professor();
            //prof.nome = "teste";// código não compila pois o atributo nome está encapsulado então não acessamos ele diretamente
          //  System.out.println(prof.nome);	// tambem não compila
            prof.setNome("teste");// agora o código compila
            /* compila pois estamos acessando o atributo nome atraves de 
             * um método e nao diretamente
             */
            System.out.println(prof.getNome());
         
	}

}

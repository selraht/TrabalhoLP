
public class Main {

	public static void main(String[] args) {
		
            Professor prof = new Professor();
            //prof.nome = "teste";// c�digo n�o compila pois o atributo nome est� encapsulado ent�o n�o acessamos ele diretamente
          //  System.out.println(prof.nome);	// tambem n�o compila
            prof.setNome("teste");// agora o c�digo compila
            /* compila pois estamos acessando o atributo nome atraves de 
             * um m�todo e nao diretamente
             */
            System.out.println(prof.getNome());
         
	}

}

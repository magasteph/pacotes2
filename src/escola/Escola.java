package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		
		felipe.setNome ("Felipe Jr");
		felipe.setIdade( 15 );
				
		System.out.println("O aluno " + felipe.getNome() + 
				" tem " + felipe.getIdade() + " anos ");
	}
}


public class Main {

	public static void main(String[] args) {
		
		Projeto projeto = new Projeto("Projeto pindamonhangaba","01/01/0001", "99/99/9999",40 );
		
		projeto.adicionarDespesa("Criptonita", 10, 1000);
		projeto.adicionarDespesa("mao de obra", 100, 'D');
		
		System.out.println("Custo total do projeto: R$" + projeto.calcularCustoTotal());
		System.out.println("Valor total do projeto: R$" + projeto.calcularPrecoFinal());
	}

}

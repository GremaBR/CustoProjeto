import java.util.ArrayList;
public class Projeto {
	ArrayList<Despesa> despesas = new ArrayList<Despesa>();
	String nome;
	String dataInicio, dataFim;
	double margemLucro;
	
	public Projeto(String nome, String dataInicio, String dataFim, double margem) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.margemLucro = margem;
	}
	
	public double calcularCustoTotal() {
		double aux = 0;
		int i=0;
		while (i < despesas.size()) {
			aux += despesas.get(i).calcularCusto();
			i++;
		}
		return aux;
	}
	
	public double calcularPrecoFinal() {
		return (calcularCustoTotal()*margemLucro)/100;
	}
	
	public void adicionarDespesa(String descricao, int quantidadeHoras, char dificuldade) {
		MaoObra maoObra = new MaoObra(descricao,quantidadeHoras,dificuldade);
		despesas.add(maoObra);
	}
	
	public void adicionarDespesa(String descricao, int quantidadeItens, double valorUnitario) {
		Aquisicao aquisicao = new Aquisicao(descricao, valorUnitario, quantidadeItens);
		despesas.add(aquisicao);
	}
	

	
	
	
}

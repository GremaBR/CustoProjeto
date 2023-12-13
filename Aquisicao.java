public class Aquisicao extends Despesa {
	String nome;
	double valorUnitario;
	int quantidadeItens;
	
	public Aquisicao(String descricao, double valorUnitario, int quantidadeItens) {
		super(descricao);
		this.quantidadeItens = quantidadeItens;
		this.valorUnitario = valorUnitario;
	}

	public double calcularCusto() {
		return valorUnitario * quantidadeItens;
	}
}

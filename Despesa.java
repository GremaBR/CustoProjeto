
public abstract class Despesa {
    String descricao;
	
	Despesa(String descricao) {
		this.descricao = descricao;
	};
	public abstract double calcularCusto();
	
}


public class MaoObra extends Despesa {


	int quantidadeHoras;
	char dificuldade;
	
	public MaoObra(String descricao, int quantidadeHoras, char dificuldade ) {
		super(descricao);
		this.quantidadeHoras = quantidadeHoras;
		this.dificuldade = dificuldade;
	}

	public double calcularCusto() {
		if(dificuldade == 'F' || dificuldade == 'f') return quantidadeHoras * 10;
		else if(dificuldade == 'M' || dificuldade == 'm')return quantidadeHoras * 25;
		else return quantidadeHoras * 50;
	}

}


public class Passagem {

	public String nomePassageiro;
	public Double preco;
	public int numeroAdultos;
	
	public void calcularPreco() {
		preco = preco * numeroAdultos;
	}
	
	public String imprimir() {
		return nomePassageiro + " - Preço: " + preco;
	}
	
}

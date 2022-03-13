
public class Principal {

	public static void main(String[] args) {
		
		Passagem passagem = new Passagem();
		passagem.nomePassageiro = "João Paulo";
		passagem.numeroAdultos = 2;
		passagem.preco = 1500.00;
		
		passagem.calcularPreco();
		
		System.out.println(passagem.imprimir());
		
	}
	
}

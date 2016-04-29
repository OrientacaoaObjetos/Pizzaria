
public class Principal {
	
	public static void main(String[] args) {
		
		//Criar 3 pizzas com ingrediente diferentes
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Calabresa");
		pizza1.adicionaIngrediente("Queijo");
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Lombo");
		pizza2.adicionaIngrediente("Queijo");
		pizza2.adicionaIngrediente("Batata Palha");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Calabresa");
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Batata Palha");
		pizza3.adicionaIngrediente("Azeitona");
		pizza3.adicionaIngrediente("Palmito");
		
		//Adiciona essas Pizzas em um CarrinhoDeCompra
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		
		//Imprime o total do CarrinhoDeCompra
		System.out.println("Total do Carrinho: " + carrinho.totalGasto());
		
		//Imprime a quantidade utilizada de cada ingrediente
		System.out.println("Quantidade de ingredientes utilizados: " + Pizza.ingredientesGastos);
		
	}

}

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Pizza> listaPizzas;
	
	public CarrinhoDeCompras() {
		listaPizzas = new ArrayList<>();
	}
	
	public Integer totalPizzasAdicionadas() {
		return listaPizzas.size();
	}
	
	public void adicionarPizza(Pizza pizza) {
		
		if (pizza.ingredientesUtilizados.size() < 1) {
			System.out.println("A pizza não possui nenhum ingrediente");
		}
		
		listaPizzas.add(pizza);
	}
	
	public double totalGasto() {
		
		double total = 0;
		
		for (Pizza pizza : listaPizzas) {
			total += pizza.getPreco();
		}
		
		return total;
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
	
	static HashMap<String, Integer> ingredientesGastos = new HashMap<>();
	List<String> ingredientesUtilizados;
	
	public Pizza() {
		ingredientesUtilizados = new ArrayList<>();
	}
	
	public void adicionaIngrediente(String ingrediente) {
		ingredientesUtilizados.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public double getPreco() {
		
		if (ingredientesUtilizados.size() <= 2) {
			return 15;
		} else if (ingredientesUtilizados.size() >= 3 && ingredientesUtilizados.size() <= 5) {
			return 20;
		} else if (ingredientesUtilizados.size() > 5) {
			return 23;
		}
			
		return 0;
		
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		Integer totalIngredienteGasto = ingredientesGastos.get(ingrediente) != null ? ingredientesGastos.get(ingrediente) : 0;
		ingredientesGastos.put(ingrediente, totalIngredienteGasto+1);
	}
}

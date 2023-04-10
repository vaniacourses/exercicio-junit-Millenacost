package carrinho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import produto.*;

public class carrinhoTest {
	private Carrinho carrinho;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
	}
	
	@Test
	public void testGetValorTotal() {
		Produto produto = new Produto("Caneta", 1.2);
		carrinho.addItem(produto);		
		Assertions.assertEquals(1.2, carrinho.getValorTotal());		
	}
	
	@Test
	public void testQtdeItems() {
		Produto produto = new Produto("Caneta", 1.2);
		carrinho.addItem(produto);		
		Assertions.assertEquals(1, carrinho.getQtdeItems());		
	}
}

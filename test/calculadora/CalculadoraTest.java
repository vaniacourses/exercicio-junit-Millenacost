package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@Test
	public void testSubtracao() {
		int result = calc.subtracao(7, 5);		
		Assertions.assertEquals(2, result);		
	}
	
	@Test
	public void testMultiplicacao() {
		int result = calc.multiplicacao(7, 5);		
		Assertions.assertEquals(35, result);		
	}
	
	@Test
	public void testSomatoria() {
		int result = calc.somatoria(3);		
		Assertions.assertEquals(6, result);		
	}
	
	@Test
	public void testIsTrue() {
		boolean result = calc.ehPositivo(3);		
		Assertions.assertEquals(true, result);		
	}
	
	@Test
	public void testComparaAEhIgualB() {
		int result = calc.compara(3,3);		
		Assertions.assertEquals(0, result);		
	}
	
	@Test
	public void testComparaAMaiorQueB() {
		int result = calc.compara(4,3);		
		Assertions.assertEquals(1, result);		
	}
	
	@Test
	public void testComparaAMenorQueB() {
		int result = calc.compara(3,4);		
		Assertions.assertEquals(-1, result);		
	}


}

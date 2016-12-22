package ull.herramientas.IntegracionContinuaQuickSort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * \class TestQuicksort
 * Clase para probar el código, utiliza JUnit 4.11
 * \author Orlandy Ariel Sánchez A.
 *
 */
public class TestQuicksort
{
	private  int [] arrayDesordenado;
	private int [] arrayOrdenado;
	private Quicksort quick;
	/**
	 * Método que inicializa los atributos antes de cada test
	 */
	@Before
	public void inicializacion()
	{
		arrayDesordenado = new int[]{30,23,1,34,2,1,4,9,16};
		arrayOrdenado = new int[]{1,1,2,4,9,16,23,30,34};
		quick = new Quicksort();
	}
	/**
	 * \brief Método que comprueba que son distintos
	 */
	@Test
	public void arraysDistinto()
	{
		if(arrayDesordenado != arrayOrdenado)
			quick.sort(arrayDesordenado);
		assertArrayEquals(arrayDesordenado, arrayOrdenado);
	}
	/**
	 * \brief Método que comprueba que son iguales los arrays
	 * parte de tener dos arrays con los mismos elementos, pero uno de ellos ordenado
	 * el otro utilizará el quicksort para ordenarlo y comprabar que efectivamente son iguales.
	 */
	@Test 
	public void arraysIgual()
	{
		quick.sort(arrayDesordenado);
		assertArrayEquals(arrayDesordenado, arrayOrdenado);
	}
	
	@Test
	public void arrayVacio()
	{
		int [] arrayTemp =new int []{};
		quick.sort(arrayTemp);
		assertArrayEquals(new int []{}, arrayTemp);
	}
}

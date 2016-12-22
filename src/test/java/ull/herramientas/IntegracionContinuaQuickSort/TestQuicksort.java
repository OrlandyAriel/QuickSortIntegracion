package ull.herramientas.IntegracionContinuaQuickSort;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuicksort
{
	private  int [] arrayDesordenado;
	private int [] arrayOrdenado;
	private Quicksort quick;
	@Before
	public void inicializacion()
	{
		arrayDesordenado = new int[]{30,23,1,34,2,1,4,9,16};
		arrayOrdenado = new int[]{1,1,2,4,9,16,23,30,34};
		quick = new Quicksort();
		
	}

	@Test 
	public void arraysIgual()
	{
		quick.sort(arrayDesordenado);
		assertArrayEquals(arrayDesordenado, arrayOrdenado);
	}
	@Test
	public void arraysDistinto()
	{
		assertArrayEquals(arrayDesordenado, arrayOrdenado);
	}

}

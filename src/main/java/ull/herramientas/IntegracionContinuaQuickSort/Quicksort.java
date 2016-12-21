package ull.herramientas.IntegracionContinuaQuickSort;
/**
 * Clase Quicksort
 * \breif esta clase utiliza el algoritmo Quicksort para ordenar arrays de números enteros.
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class Quicksort  {

	private int[] numbers;
	private int number;
	
	/**
	 * \brief Método que ordena un array de enteros mediante el uso del algoritmo QuickSort
	 * \param values, Array que se pretende ordenar.
	 */
	public void sort(int[] values) {
		///Comprueba si el array es nulo o está vacio.
		if (values ==null || values.length==0){
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}
	
	/**
	 * \brief Método que contiene el algoritmo Quicksort,
	 * este ordena valores enteros del array.
	 * \param low, inicio de subarray que se va a ordenar
	 * \param high, final del subarray que se va a ordenar.
	 */
	private void quicksort(int low, int high) {

		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high-low) / 2];
		//Divide la lista en 2.
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		/// Recursividad.
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}
	/**
	 * \brief Método que intercambia los datos que se encuentran en las posiciones i y j del array.
	 * @param i, posición i
	 * @param j, posición j.
	 */
	
	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
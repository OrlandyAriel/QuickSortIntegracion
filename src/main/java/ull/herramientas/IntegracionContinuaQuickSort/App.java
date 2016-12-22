package ull.herramientas.IntegracionContinuaQuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int [] arrayDesordenado = {30,23,1,34,2,1,4,9,16};
    	Quicksort quick = new Quicksort();
    	quick.sort(arrayDesordenado);
    	for (int i = 0; i < arrayDesordenado.length; i++)
		{
			System.out.print(arrayDesordenado[i]+ ",");
		}
        System.out.println( "Hello World!" );
        
    }
}

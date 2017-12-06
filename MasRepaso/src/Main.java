
public class Main {

	public static void main(String[] args) {
		// Primitivas vs Wrappers

		// Datos primitivos
		/*
		 * int a = 0; char b = 's'; boolean dato = true; float flotante; double
		 * dobleComaFlotante; short corto; byte unByte; long largo;
		 * 
		 * //Wrappers : Clases
		 *//**
			* 
			*//*
				 * 
				 * Integer claseEntero = 0;
				 * 
				 * 
				 * 
				 * Character charCLass = new Character('w');
				 * 
				 * Character charCLass2 = 'w'; char miChar = 'w'; Boolean booleanClass; Float
				 * floatClass; Double doubleClass; Short shortClass; Byte byteClass; Long
				 * longClass; Chapa chapa = new Chapa(); Chapa chapa2 = new Chapa(); Chapa
				 * chapa3 = new Chapa(); Chapa chapa4 = new Chapa(); Puerta puerta = new
				 * Puerta(); Puerta puerta2 = new Puerta(); puerta.setChapa(chapa2);
				 * puerta.setChapa(chapa4); Chapa chapa5 = new Chapa(); chapa5 =
				 * puerta.getChapa(); puerta2.setChapa(chapa5);
				 */

		// int[] array = {10, 15, 22, 14,8, 7, 4, 1, 20, 900, 800};
		// burbuja(array);
		/*Thread hilo = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int[] array = { 10, 15, 22, 14, 8, 7, 4, 1, 20, 900, 800 };
				int comparaciones = 0;
				int aux = 0;
				int intercambios = 0;
				for (int x = 0; x < array.length; x++) {
					System.out.print(array[x] + " ");
				}
				System.out.println();
				for (int z = 1; z < array.length; ++z) {
					for (int v = 0; v < (array.length - z); ++v) {
						comparaciones++;
						if (array[v] > array[v + 1]) {
							aux = array[v];
							array[v] = array[v + 1];
							array[v + 1] = aux;
							intercambios++;
						}
					}
					try {
						Thread.sleep(3000);
						for (int x = 0; x < array.length; x++) {
							System.out.print(array[x] + " ");
						}
						System.out.println();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println("\nComparaciones: " + comparaciones + "\nIntercambios: " + intercambios);
			}

		});

		hilo.start();*/
		
		int[] array = {10, 15, 22, 14,8, 7, 4, 1, 20, 9, 11};
		//cocktailSort(array);
		//insertSort(array);
		int maxVal = 22;
		bucketSort(array,maxVal);

	}
	
	 public static void bucketSort(int[] array, int maxVal) {
	      int [] bucket=new int[maxVal+1];
	 
	      for (int i=0; i<bucket.length; i++) {
	         bucket[i]=0;
	      }
	 
	      for (int i=0; i<array.length; i++) {
	         bucket[array[i]]++;
	      }
	 
	      int outPos=0;
	      for (int i=0; i<bucket.length; i++) {
	         for (int j=0; j<bucket[i]; j++) {
	            array[outPos++]=i;
	            
	         }
	      }
	      for (int x = 0; x < array.length; x++) 
	      {
	    	  System.out.print(array[x] + " ");
	      }
	      System.out.println("\n");
	   }
	
	public static void insertSort(int[] array)
	{
		for (int x = 0; x < array.length; x++) 
		{
			System.out.print(array[x] + " ");
		}
		System.out.println("\n");
		
		int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            for (int x = 0; x < array.length; x++) 
    		{
    			System.out.print(array[x] + " ");
    		}
    		System.out.println();
        }
	}

	public static void cocktailSort(int[] array) {
		boolean swapped;
		for (int x = 0; x < array.length; x++) 
		{
			System.out.print(array[x] + " ");
		}
		System.out.println();
		do {
			swapped = false;
			for (int i = 0; i <= array.length - 2; i++) {
				if (array[i] > array[i + 1]) {
					// test whether the two elements are in the wrong order
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
			for (int x = 0; x < array.length; x++) 
			{
				System.out.print(array[x] + " ");
			}
			System.out.println();
			if (!swapped) {
				// we can exit the outer loop here if no swaps occurred.
				break;
			}
			swapped = false;
			for (int i = array.length - 2; i >= 0; i--) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
			for (int x = 0; x < array.length; x++) 
			{
				System.out.print(array[x] + " ");
			}
			System.out.println();
			// if no elements have been swapped, then the list is sorted
		} while (swapped);
		
		for (int x = 0; x < array.length; x++) 
		{
			System.out.print(array[x] + " ");
		}
		System.out.println();

	}

	public static void burbuja(int[] array) {
		int comparaciones = 0;
		int aux = 0;
		int intercambios = 0;
		for (int z = 1; z < array.length; ++z) {
			for (int v = 0; v < (array.length - z); ++v) {
				comparaciones++;
				if (array[v] > array[v + 1]) {
					aux = array[v];
					array[v] = array[v + 1];
					array[v + 1] = aux;
					intercambios++;
				}
			}
			for (int x = 0; x < array.length; x++) {
				System.out.print(array[x] + " ");
			}
			System.out.println();
		}
		System.out.println("\nComparaciones: " + comparaciones + "\nIntercambios: " + intercambios);
	}

}

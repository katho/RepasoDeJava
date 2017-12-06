
public class Main {

	public static void main(String[] args) {
		// Primitivas vs Wrappers
		
		//Datos primitivos
/*		int a = 0;
		char b = 's';
		boolean dato = true;
		float flotante;
		double dobleComaFlotante;
		short corto;
		byte unByte;
		long largo;
		
		//Wrappers : Clases
		*//**
		 * 
		 *//*
		
		Integer claseEntero = 0;
		
		
		
		Character charCLass = new Character('w');
		
		Character charCLass2 = 'w';
 		char miChar = 'w';
		Boolean booleanClass;
		Float floatClass;
		Double doubleClass;
		Short shortClass;
		Byte byteClass;
		Long longClass;
		Chapa chapa = new Chapa();
		Chapa chapa2 = new Chapa();
		Chapa chapa3 = new Chapa();
		Chapa chapa4 = new Chapa();
		Puerta puerta = new Puerta();
		Puerta puerta2 = new Puerta();
		puerta.setChapa(chapa2);
		puerta.setChapa(chapa4);
		Chapa chapa5 = new Chapa();
		chapa5 = puerta.getChapa();
		puerta2.setChapa(chapa5);
		*/
		
		
		
		//int[] array = {10, 15, 22, 14,8, 7, 4, 1, 20, 900, 800};
		//burbuja(array);
		Thread hilo = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int[] array = {10, 15, 22, 14,8, 7, 4, 1, 20, 900, 800};
				int comparaciones = 0;
				int aux = 0;
				int intercambios = 0;
				for(int x = 0; x < array.length; x++)
			     {
			    	  System.out.print(array[x]+" ");
			     }
				System.out.println();
				for(int z = 1; z < array.length; ++z) 
				{
				      for(int v = 0; v < (array.length - z); ++v) 
				      {
				         comparaciones++;
				         if(array[v] > array[v + 1]) 
				         {
				            aux = array[v];
				            array[v] = array[v + 1];
				            array[v + 1] = aux;
				            intercambios++;
				         }
				      }
				      try {
						Thread.sleep(3000);
						for(int x = 0; x < array.length; x++)
					      {
					    	  System.out.print(array[x]+" ");
					      }
						System.out.println();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				      
				      
				    }
					System.out.println("\nComparaciones: "+comparaciones+"\nIntercambios: "+intercambios);
			}
			
		});
		
		hilo.start();
			
			
	}
	
	
	public static void burbuja(int[] array)
	{
		int comparaciones = 0;
		int aux = 0;
		int intercambios = 0;
		for(int z = 1; z < array.length; ++z) 
		{
		      for(int v = 0; v < (array.length - z); ++v) 
		      {
		         comparaciones++;
		         if(array[v] > array[v + 1]) 
		         {
		            aux = array[v];
		            array[v] = array[v + 1];
		            array[v + 1] = aux;
		            intercambios++;
		         }
		      }
		      for(int x = 0; x < array.length; x++)
		      {
		    	  System.out.print(array[x]+" ");
		      }
		      System.out.println();
		    }
			System.out.println("\nComparaciones: "+comparaciones+"\nIntercambios: "+intercambios);
	}
	
	

}

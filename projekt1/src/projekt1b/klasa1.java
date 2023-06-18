package projekt1b;

import java.util.Random;

public class klasa1 {
	public static void funkcja1() {
	
		//Wybiera dwie losowe liczby od 1 do 100. Nastepnie sprawdza ktora liczba jest wieksza i wyswietla odpowiedz na ekranie.
	  Random randValue = new Random();
		int value = randValue.nextInt(100);
		int value1 = randValue.nextInt(100);
		System.out.println("wylosowane liczby: " +value+ " " +value1);
		if ((value1) < (value))
	    	{
		    System.out.println("Pierwsza liczba jest wieksza od drugiej");
	    	}
		else if ((value) < (value1))
		    {
	        System.out.println("Druga liczba jest wieksza od pierwszej ");
		    }
		else if ((value) == (value1))
		    {
		    System.out.println("Liczby sa rowne ");
		    }
		}
	}

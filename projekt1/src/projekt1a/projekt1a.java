package projekt1a;

import java.util.Scanner;
import java.io.IOException;
import projekt1b.*;
import projekt1c.*;

public class projekt1a {
  @SuppressWarnings("static-access")
public static void main(String[] args) throws IOException {
	 System.out.println("Wybierz krory program chcesz uruchomic: "); 
	 System.out.println("1) Wylosuj dwie liczby i sprawdź czy pierwsza jest większa od drugiej."); 
	 System.out.println("2) Za pomocą pętli wygeneruj 20 liczb podzielnych przez 6. "); 
	 System.out.println("3) Odczytać bieżącą datę i wyświetlić ją w formacie:  "); 
	 System.out.println("4) Wygeneruj jednowymiarową losową tablicę liczb i podziel jej wartości przez 2. Wyświetl wynik przed i po dzieleniu."); 
	 System.out.println("5) Wygeneruj jednowymiarową losową tablicę liczb i zapisz jej zawartość do pliku."); 
	 Scanner scan = new Scanner(System.in);
	  int input = scan.nextInt();
	  switch(input)
	  {
	  case 1: {
		  klasa1 Klasa1 = new klasa1();
		  Klasa1.funkcja1();
		  break;
	  	} 
	  case 2: {
		  klasa2 Klasa2 = new klasa2();
		  Klasa2.funkcja2();
		  break;
	  	}
	  case 3: {
		  klasa3 Klasa3 = new klasa3();
		  Klasa3.funkcja3();
		  break;
			  }
	  
	  case 4: {
		  klasa4 Klasa4 = new klasa4();
		  Klasa4.funkcja4();
	        break;
	  	}
	  case 5: {
		  klasa5 Klasa5 = new klasa5();
		  Klasa5.funkcja5();
	        break;
	  	}
	  default: {
		  System.out.println("Wprowadzono niepoprawny numer ");
	  	}
	 }
  }
}
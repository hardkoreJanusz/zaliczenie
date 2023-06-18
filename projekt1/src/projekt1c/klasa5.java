package projekt1c;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class klasa5 {
	public static void funkcja5() throws IOException {
		//Program tworzy tabele z 5 liczbami i przypisuje im losowa wartosc od 1 do 100.
		  //Nastepnie tabele zapisuje w stringu a stringa w pliku wynik.txt.
		  
		  int tab[] = {0, 0, 0, 0, 0};
	        FileWriter plik = new FileWriter("wynik.txt");
	        Random rand = new Random();
	        String wynik = "";
	        for(int i = 0; i < 5; i++)
	        {
	            tab[i] = rand.nextInt(100);
	            System.out.print(tab[i] + " ");
	            wynik = wynik + " " + tab[i];
	        }
	        plik.write(wynik);
	        plik.close();
	}
}

package projekt1c;

import java.util.Random;

public class klasa4 {
	public static void funkcja4() {
		//Program tworzy tabele z 5 liczbami, przypisuje im losowa wartosc od 1 do 100 i wyswietla ja na ekranie.
		  //Nastepnie wszystkie liczby w tabeli dzielone sa przez 2 i zostaja ponownie wyswietlone.
		  int tab[] = {0, 0, 0, 0, 0};
	        Random rand = new Random();
	        System.out.print("Wygenerowana tabela: ");
	        for(int i = 0; i < 5; i++)
	        {
	            tab[i] = rand.nextInt(100);
	            System.out.print(tab[i] + " ");
	        }
	        System.out.print("\n\nTabela po dzialaniach: ");
	        for(int j = 0; j < 5; j++)
	        {
	            tab[j] = tab[j] / 2;
	            System.out.print(tab[j] + " ");
	           
	        }
	}
}

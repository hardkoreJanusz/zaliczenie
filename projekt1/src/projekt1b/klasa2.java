package projekt1b;

import java.util.Random;

public class klasa2 {
	public static void funkcja2() {
		//tworzy tabele 20 liczb. Nastepnie zastepuje kazda liczbe liczba podielna przez 6.
		  int tab[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
	        Random rand = new Random();
	        System.out.print("Wygenerowana tabela: ");
	        for(int i = 0; i < 20; i++)
	        {
	            int x = rand.nextInt(100);
	            if(x%6 == 0 && x > 0)
	            {
	                tab[i] = x;
	            }
	            else
	            {
	                if(i > 0)
	                {
	                    i--;
	                }
	                else
	                {
	                    i = 0;
	                }
	            }
	        }
	        for(int j = 0; j < 20; j++)
	        {
	            System.out.print(tab[j] + " ");
	        }
	}
}

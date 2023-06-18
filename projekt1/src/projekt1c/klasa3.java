package projekt1c;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class klasa3 {
	public static void funkcja3() {
		// Pobiera aktualna date i godzine. Nastepnie formatuje ja do podanego w cwiczeniu formatu i wyswietla na ekranie.	
		  LocalDateTime czas = LocalDateTime.now();
		  DateTimeFormatter Format = DateTimeFormatter.ofPattern("\ndd\n\nMM\n\nyyyy\n\nHH:mm");

		  String formattedDate = czas.format(Format);
		  System.out.println("Dzisiejsza data: " + formattedDate);
	}
}

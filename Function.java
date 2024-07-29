/*
 * Scrivere un programma SpaziVocali che chiede all'utente di inserire una stringa e stampa il numero complessivo di 
  spazi che sono immediatamente seguiti da una vocale. Per esempio, se si immette "A ogni uomo, ogni giorno, 
  I suoi diritti", il programma stampa 4
 * */
import java.util.Scanner;
public class Function {
	public static String inserimentoStringa() {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci una stringa: ");
		String stringa = input.nextLine();
		return stringa;
	}
	
	public static void stampaStringa(String stringa) {
		int sommaSpazi=0;
		char[] vocali = {'a','e','i','o','u'};
		for(int i=0; i<stringa.length(); i++) {
			if(stringa.charAt(i)==' ') {
				for(int j=0; j<vocali.length; j++) {
					if(stringa.charAt(i+1)==vocali[j]) {
						sommaSpazi+=1;
					}
				}
			}
		}
		System.out.println("\nConto gli spazi: " + sommaSpazi);
	}
}

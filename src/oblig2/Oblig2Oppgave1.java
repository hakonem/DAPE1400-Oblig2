package oblig2;

/*Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen.
Dersom innlest øvre grense er mindre enn eller lik nedre grense, skal programmet skrive ut en melding
til brukeren om dette og foreta ny innlesing. Når godkjente grenser er lest inn, skal programmet beregne
nevnte sum og summen skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense
er 8 skal det skrives ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
Test ut programmet med nedre grense lik 1 og øvre grense lik 100.
Legg inn et linjeskift for hvert 10. tall i summen.
 */
import static javax.swing.JOptionPane.*;

public class Oblig2Oppgave1 {
	public static void main(String[] args) {
		
		//Lese inn nedre og øvre grenser og konvertere til int
		int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));
		int øvreGrense = Integer.parseInt(showInputDialog("Skriv inn øvre grense"));
		
		/*Hvis øvre grense er lik eller mindre enn nedre grense, får bruker en melding om det, og de blir bedt om å
		skrive inn verdiene på nytt.
		*/
		while(øvreGrense <= nedreGrense) {
			System.out.println("Øvre grense må være større enn nedre grense! Prøv igjen!");
			nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense"));
			øvreGrense = Integer.parseInt(showInputDialog("Skriv inn øvre grense"));
		}
		//Initialisere variablene som trengs til for-lokka
		int i = nedreGrense;
		int sum = 0;
		int teller = 0;
		
		/*Begynne med nedre grense, legge til 1 i hvert gjennomløp av løkka så lenge i er mindre enn øvre grense.
		Skriv ut hvert tall med plusstegn bak.
		 */
		for(i = nedreGrense; i < øvreGrense; i++) {
			sum += i;
			teller ++;
			System.out.print(i + " + ");
			
		//Etter hvert 10. tall i summen (dvs når verdien av teller er delelig med 10), legge inn linjeskift.
			if(teller % 10 == 0) {
				System.out.println();
			}
		}
		//Til slutt må øvre grense skrives ut og legges til sum for å få totalsummen.
		System.out.print(øvreGrense + " = " + (sum + øvreGrense));
	}
}


package oblig2;

import static javax.swing.JOptionPane.*;

class Tallspill {
	public int nyttTall() {
		// Trekker og returnerer et slumptall mellom 0 og 200.
		// Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
		return (int) (Math.random() * 201);
	}
	
	//public void visMelding(String melding) {
		// Viser parameterens innhold i en meldingsboks.
		String melding = showInputDialog("Jeg tenker på et tall mellom 0 og 200.\nPrøv å gjette på tallet: ");
	//}
	
	private void forLite(int tall) {
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
		String forLite = showInputDialog(tall + " er for lite! Prøv igjen!");
	}
	
	private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
		String forStort = showInputDialog(tall + " er for stort! Prøv igjen!");
	}
	
	public void avsluttRunde(int antall, int gjetning) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
		String avsluttRunde = showInputDialog(antall + " er riktig!\nDu gjettet riktig på " + gjetning + " forsøk.");
	}
	
	public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
		nyttTall();
		int gjetning = 0;
		int tall = Integer.parseInt(melding);
		
		while(tall != nyttTall()) {
		
			if (tall < nyttTall()) {
				forLite(tall);
				gjetning++;
			} else if (tall > nyttTall()) {
				forStort(tall);
				gjetning++;
			} else {
				avsluttRunde(tall, gjetning);
				gjetning++;
			}
		}
	}
	
	public static void main(String[] args) {
		Tallspill spill1 = new Tallspill();
		spill1.kjørSpill();
		}
}
package it.java.ciclabile;

public class Main {

	public static void main(String[] args) {
		// inizializzazione con un array di interi
		int[] numeri = {1, 2, 3, 4, 5};
		Interi myInteri = new Interi(numeri);
		
		// Uso dei metodi getElementoSuccessivo e hasAncoraElementi
        myInteri.stampa();

        // Creazione di un'istanza senza parametri e aggiunta di elementi
        Interi elenco = new Interi();
        elenco.addElemento(10);
        elenco.addElemento(15);
        elenco.addElemento(20);	
	
        // riportare la posizione a 0 per ciclarli ancora
		elenco.getNumeroElementi();
		
		// Stampa tutti gli elementi nuovamente
        elenco.stampa();
    }
}

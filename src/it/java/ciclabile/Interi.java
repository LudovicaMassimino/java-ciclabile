/* Consegna:
 * Creare una classe che gestisce un elenco di interi e permette 
 * di ciclare (for) attraverso di essi con i metodi:
 * - getElementoSuccessivo che restiruisce l'elemento corrente e 
 * incrementa
 * - hasAncoraElementi che deve restituire true se ci sono ancora 
 * elementi da restituire
 * 
 * Bonus: prevedere anche un costruttore che non prenda parametri 
 * e un metodo addElemento che permetta di aggiungere un nuovo 
 * intero all’elenco da ciclare. */

package it.java.ciclabile;

public class Interi {
	
	private int[]elementi;
	private int indiceCorrente;
	private int numeroElementi;
	
	public int getNumeroElementi() {
		return numeroElementi;
	}

	// costruttore che accetta un array di interi e lo assegna all'attributo elementi
	public Interi(int[] elementiIniziali) {
		this.elementi = elementiIniziali;
		this.numeroElementi = elementi.length;
		this.indiceCorrente = 0;
	}
	
	// costruttore per inizializzare un array vuoto
	public Interi() {
		this.elementi = new int[10];
		this.numeroElementi = 0;
		this.indiceCorrente = 0;
	}

	
	// Metodo per aggiungere un nuovo elemento all'elenco
    public void addElemento(int nuovoElemento) {
        if (numeroElementi == elementi.length) {
            // Espande l'array se necessario
            int[] nuovoArray = new int[elementi.length * 2];
            for (int i = 0; i < elementi.length; i++) {
                nuovoArray[i] = elementi[i];
            }
            elementi = nuovoArray;
        }
        elementi[numeroElementi] = nuovoElemento;
        numeroElementi++;
    }
    
    // Restituisce l'elemento corrente e incrementa
    public int getElementoSuccessivo() {
        int elemento = elementi[indiceCorrente];
        indiceCorrente++;
        return elemento;
    }

    // Restituisce true se ci sono ancora elementi da restituire
    public boolean hasAncoraElementi() {
        return indiceCorrente < numeroElementi;
    }
    
    public void stampa() {
        if (hasAncoraElementi()) {
            System.out.println("indice: " + indiceCorrente + " numero: " + getElementoSuccessivo());
            stampa();
        }
    }
}

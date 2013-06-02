package game;

import java.util.Collections;

public class PlayingCardDeck extends CardDeck {
	
	/*
	 * Unser PlayingCardDeck soll alle Karten eines
	 * CardDeck enthalten. Der einzige Unterschied ist,
	 * dass die Karten des Decks anschließend gemischt
	 * werden müssen.
	 * 
	 * Über den aufruf des super Konstruktors erzeugen
	 * wir zunächst ein sortiertes Kartenspiel.
	 * 
	 * Da wir für das Deck eine ArrayList verwenden,
	 * können wir diese mit Hilfe der Collections Klasse
	 * mischen
	 */
	public PlayingCardDeck() {
		super();
		Collections.shuffle(this.deck);
	}
	
	// Entfernt die oberste Karte vom Stapel
	public PlayingCard dealCard() {
		return this.deck.remove(deck.size() - 1);
	}
	
	// Prüft, ob noch Karten auf dem Stapel liegen
	public boolean hasCardsLeft() {
		return this.deck.size() > 0;
	}
	
	/*
	 * Sortiert das Kartenspiel. Dies ist nur so einfach möglich,
	 * da PlayingCard das Interface Comparable implementiert!
	 */
	public void sortDeck() {
		Collections.sort(this.deck);
	}
	
	// Mischt das Kartenspiel
	public void shuffleDeck() {
		Collections.shuffle(this.deck);
	}
	
	/*
	 * Um das PlayingCardDeck auszugeben, rufen
	 * wir einfach toString() auf die ArrayList auf. Dies hat
	 * zur Folge, dass wiederum für jedes Objekt innerhalb
	 * der Liste (PlayingCard) toString() aufgerufen wird. 
	 */
	@Override
	public String toString() {
		return this.deck.toString();
	}
	
}

package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();
	//	TODO: Add a constructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	public Deck() {
		BuildDeck(1);
	}
	public Deck(int a) {
		BuildDeck(a);
	}
	public void BuildDeck(int a) {
		do {
			for (eSuit suit : eSuit.values()) {
				for (eRank rank : eRank.values()) {
					cards.add(new Card(suit, rank));
				}
			}
			a--;
		} while (a > 0);
		Collections.shuffle(cards);
	}
	
	public int getSize() {
		return this.cards.size();
	}
	public ArrayList<Card> getDeck() {
		return this.cards;
	}
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card draw() {
		return this.cards.remove(0);
	}
	
}






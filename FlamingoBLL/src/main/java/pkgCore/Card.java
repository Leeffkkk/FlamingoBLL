package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eSuit eSuit;
	private eRank eRank;
	
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(eSuit suit, eRank rank) {
		this.eSuit = suit;
		this.eRank = rank;
	}
	public Card(eRank rank, eSuit suit) {
		this.eSuit = suit;
		this.eRank = rank;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public eSuit geteSuit() {
		return eSuit;
	}

	public eRank geteRank() {
		return eRank;
	}
	
	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}
	
	


	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().getiRankNbr() - this.geteRank().getiRankNbr();
	}


	
}

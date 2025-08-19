import java.util.*;
import java.security.SecureRandom;

public class Deck{
	private final List<Card> deck = new ArrayList<>();
	SecureRandom random = new SecureRandom();
	//static Card cutCard = new Card("Cut", 0);

	//Deck constructor
	public Deck(int numDecks){
		for(int i = 0; i < numDecks; i++){
			for(Suit suit : Suit.values()){
				if(suit != Suit.CUT){
					for(Rank rank : Rank.values()){
						deck.add(new Card(rank, suit));
					}
				}
			}
		}

	}

	//Shuffle method
	public void shuffle(){
		Collections.shuffle(deck);
	}

	//Getter method to return cards in the deck
	public List<Card> getCards(){
		return deck;
	}


	public Card deal(){
		Card cardCopy = deck.get(0);
		deck.remove(0);
		return cardCopy;
	}



	

}
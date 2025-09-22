import java.util.*;
import java.security.SecureRandom;

public class Deck{
	private final List<Card> deck = new ArrayList<>();
	SecureRandom random = new SecureRandom();
	

	//Deck constructor
	public Deck(int numDecks){
		for(int i = 0; i < numDecks; i++){
			for(Suit suit : Suit.values()){
				for(Rank rank : Rank.values()){	
					deck.add(new Card(rank, suit));	
				}
			}
		}
		Collections.shuffle(deck);
	}

	

	//Getter method to return cards in the deck
	public List<Card> getCards(){
		return deck;
	}


	public Card deal(){
		return deck.remove(0);
	}



	public Card getTop(){
		Card cardCopy = deck.get(0);
		return cardCopy;	
	}







	
	





	

}
import java.util.*;

public class Deck{
	private final List<Card> deck = new ArrayList<>();

	//Deck constructor
	Deck(int numDecks){
		for(int i = 0; i < numDecks; i++){
			for(Suit suit : Suit.values()){
				for(Rank rank : Rank.values()){
					deck.add(new Card(rank, suit));
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

	/*public Card burnTopCard(){
		return deck.remove(0);
	}*/









}
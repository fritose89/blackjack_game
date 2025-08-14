import java.util.*;

public class Deck{
	private final List<Card> deck = new ArrayList<>();

	//Deck constructor
	public Deck(int numDecks){
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


	//method to deal cards from the top of the deck
	public void removeTopCard(){
		deck.remove(0);
	}

	public Card copyCard(){
		Card cardCopy = deck.get(0);
		return cardCopy;
	}

	/*
	public static void deal(Object object){
		if(object instanceof Player){
			deck.copyCard();

		}
	}
	*/

}
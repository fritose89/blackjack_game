import java.util.*;
import java.security.SecureRandom;

public class Deck{
	private final List<Card> deck = new ArrayList<>();
	SecureRandom random = new SecureRandom();
	static Card cutCard = new Card(Rank.ZERO, Suit.CUT);

	//Deck constructor
	public Deck(int numDecks){
		for(int i = 0; i < numDecks; i++){
			for(Suit suit : Suit.values()){
				if(suit != Suit.CUT){
					for(Rank rank : Rank.values()){
						if(rank != Rank.ZERO){
							deck.add(new Card(rank, suit));
						}	
					}
				}
			}
		}
		//Collections.shuffle(deck);
		int cards = numDecks * 52;
		int minPercent  = (int)(cards * 0.6);
		int maxPercent = (int)(cards * 0.8);
		int rangeOfCut = (maxPercent - minPercent) + 1;
		int cutCardIndex = random.nextInt(rangeOfCut) + minPercent;
		deck.add(cutCardIndex, cutCard);


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
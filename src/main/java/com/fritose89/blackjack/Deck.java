//package com.fritose89.blackjack;
import java.util.*;
import java.security.SecureRandom;

public class Deck{
	private final List<Card> deck = new ArrayList<>();
	SecureRandom random = new SecureRandom();
	static Card cutCard = new Card(Rank.ZERO, Suit.CUT);
	private boolean reshuffleNeeded;
	

	//Deck constructor
	public Deck(int numDecks){
		buildDeck(numDecks);
	}

	public void rebuildDeck(int numDecks){
		buildDeck(numDecks);
	}

	private void buildDeck(int numDecks){
		reshuffleNeeded = false;
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
		Collections.shuffle(deck);
		int cards = numDecks * 52;
		int minPercent = (int)(cards * 0.6);
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
		Card dealtCard = deck.remove(0);

		if(dealtCard.getRank() == Rank.ZERO && dealtCard.getSuit() == Suit.CUT){
			reshuffleNeeded = true;
			return deal();
		}
		return dealtCard;
	}



	public Card getTop(){
		Card cardCopy = deck.get(0);
		return cardCopy;	
	}


	public boolean isReshuffleNeeded(){
		return reshuffleNeeded;
	}

	public void resetDeck(){
		deck.clear();
	}






	
	





	

}
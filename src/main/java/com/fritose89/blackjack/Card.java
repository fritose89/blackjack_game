package com.fritose89.blackjack;

public class Card{

	private final Rank rank;
	private final Suit suit;
	public static final Card cutCard = new Card(null, null);

	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank(){
		return rank;
	}

	public Suit getSuit(){
		return suit;
	}


	@Override
	public String toString(){
		return rank + " of " + suit;
	}


}
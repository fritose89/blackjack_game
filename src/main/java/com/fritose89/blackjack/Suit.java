//package com.fritose89.blackjack;

public enum Suit{
	HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs"), SPADES("Spades");

	private final String symbol;

	Suit(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}
}
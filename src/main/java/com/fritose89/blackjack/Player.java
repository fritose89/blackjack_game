//package com.fritose89.blackjack;

import java.util.*;

public class Player{

	
	private List<Card> playerHand;
	private int playerBank;

	public Player(){
		playerHand = new ArrayList<>();
		playerBank = 500;
	}

	public void addFunds(int fundsToAdd){
		playerBank = playerBank + fundsToAdd;
	}

	public int removeFunds(int fundsToRemove){
		playerBank = playerBank - fundsToRemove;
		int difference = (playerBank + fundsToRemove) - playerBank;	
		return difference;

	}

	public int returnPlayerFunds(){
		return playerBank;
	}

	public void recieveCardPlayer(Card card){
		playerHand.add(card);
	}

	public List<Card> returnPlayerHandArray(){
		return playerHand;
	}

	public void resetPlayerHand(){
		playerHand.clear();
	}

	public String returnPlayerHandUser(){
		List<String> tempHand = new ArrayList<>();
		for(Card card : playerHand){
			tempHand.add(card.toString());
		}
		String hand = tempHand.toString();
		hand = hand.replace("[", "").replace("]", "");
		return hand;
		
	}


	public int playerHandValue(){
		int playerHandValue = 0;
		int aceCount = 0;
		for(Card card : playerHand){
			Rank rank = card.getRank();
			playerHandValue += rank.getValue();
			if(rank == Rank.ACE){
				aceCount++;
			}
		}

		while(playerHandValue > 21 && aceCount > 0){
			playerHandValue -= 10;
			aceCount--;
		}

		
		
		return playerHandValue;
	}

	

	public int size(){
		return playerHand.size();
	}	
	

}
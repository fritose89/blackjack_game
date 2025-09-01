import java.util.*;

public class Player{

	
	List<Card> playerHand;

	public Player(){
		playerHand = new ArrayList<>();
	}

	public void recieveCardPlayer(Card card){
		playerHand.add(card);
	}

	public List<Card> returnPlayerHandArray(){
		return playerHand;
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

		if(playerHandValue > 21 && aceCount > 0){
			playerHandValue -= 10;
			aceCount--;
		}

		
		
		return playerHandValue;
	}

	public boolean playerHasBlackjack(){
		int playerBlackjack = 0;
		boolean hasBlackjack = false;
		for(Card card : playerHand){
			Rank rank = card.getRank();
			if(rank == Rank.ACE || rank == Rank.KING || rank == Rank.QUEEN || rank == Rank.JACK || rank == Rank.TEN){
				playerBlackjack++;
			}
		}
		if(playerBlackjack == 2){
			hasBlackjack = true;
			return hasBlackjack;
		}

		else{
			return hasBlackjack;
		}
	}

	



		
	








}
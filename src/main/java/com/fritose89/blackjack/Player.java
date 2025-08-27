import java.util.*;

public class Player{

	static int playerHandValue;
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
		for(Card card : playerHand){
			Rank rank = card.getRank();
			playerHandValue += rank.getValue();
		}
		return playerHandValue;
	}

	public void resetplayerHandValue(){
		playerHandValue = 0;
	}


	public boolean playerHandContainsAce(){
		boolean containsAce = false;
		for(Card card : playerHand){
			if(card.getRank() == Rank.ACE){
				containsAce = true;
			}
		}
		return containsAce;
	}








}
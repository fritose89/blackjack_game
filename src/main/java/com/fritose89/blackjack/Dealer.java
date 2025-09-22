import java.util.*;

public class Dealer{

	List<Card> dealerHand;
	

	public Dealer(){
		dealerHand = new ArrayList<>();
	}

	public void recieveCardDealer(Card card){
		dealerHand.add(card);
	}

	public List<Card> returnDealerHandArray(){
		return dealerHand;
	}

	public void resetDealerHand(){
		dealerHand.clear();
	}

	public String showDealerUpCard(){
		Card tempHand = dealerHand.get(0);
		String dealerUpHand = tempHand.toString();
		return dealerUpHand;
	}

	public String returnDealerHandUser(){
		List<String> tempHand = new ArrayList<>();
		for(Card card : dealerHand){
			tempHand.add(card.toString());
		}
		String hand = tempHand.toString();
		hand = hand.replace("[", "").replace("]", "");
		return hand;
		
	}

	public int dealerHandValue(){
		int dealerHandValue = 0;
		int aceCount = 0;
		for(Card card : dealerHand){
			Rank rank = card.getRank();
			dealerHandValue += rank.getValue();
			if(rank == Rank.ACE){
				aceCount++;
			}
		}

		if(dealerHandValue > 21 && aceCount > 0){
			dealerHandValue -= 10;
			aceCount--;
		}

		return dealerHandValue;
	}



	
	public int size(){
		return dealerHand.size();
	}

	

	
}
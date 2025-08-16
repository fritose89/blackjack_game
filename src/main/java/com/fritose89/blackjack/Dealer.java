import java.util.*;

public class Dealer{

	List<Card> dealerHand;
	static int dealerHandValue;

	public Dealer(){
		dealerHand = new ArrayList<>();
	}

	public void recieveCardDealer(Card card){
		dealerHand.add(card);
	}

	public List<Card> returnDealerHandArray(){
		return dealerHand;
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
		for(Card card : dealerHand){
			Rank rank = card.getRank();
			dealerHandValue += rank.getValue();
		}
		return dealerHandValue;
	}

	public void resetDealerHandValue(){
		dealerHandValue = 0;
	}


	
}
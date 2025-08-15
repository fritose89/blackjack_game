import java.util.*;

public class Dealer{

	List<Card> dealerHand;

	public Dealer(){
		dealerHand = new ArrayList<>();
	}

	public void recieveCardDealer(Card card){
		dealerHand.add(card);
	}

	public List<Card> returnDealerHand(){
		return dealerHand;
	}

	public Card showDealerUpCard(){
		Card tempHand = dealerHand.get(0);
		return tempHand;
	}

	
}
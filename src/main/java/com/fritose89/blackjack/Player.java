import java.util.*;

public class Player{

	List<Card> playerHand;

	public Player(){
		playerHand = new ArrayList<>();
	}

	public void recieveCard(Card card){
		playerHand.add(card);
	}

	public List<Card> returnHand(){
		return playerHand;
	}




}
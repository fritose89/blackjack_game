public class Main{
	public static void main(String [] args){
		Deck deck = new Deck(1);
		Player player = new Player();
		Dealer dealer = new Dealer();
		int numOfCards = 0;
		int numOfCards2 = 0;

		deck.shuffle();

		for(Card card : deck.getCards()){
			System.out.println(card);
			numOfCards++;
		}
		System.out.println();

		System.out.println("Number of cards remaining before dealing: " + numOfCards);

		System.out.println();

		/*
			player.recieveCard(deck.copyCard());
			deck.removeTopCard();
			player.recieveCard(deck.copyCard());
			deck.removeTopCard();
			*/
		player.recieveCard(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		System.out.println("First dealer card: " + dealer.returnDealerHand());
		player.recieveCard(deck.deal());
		dealer.recieveCardDealer(deck.deal());

		System.out.println("Player hand after dealing: " + player.returnPlayerHand());
		System.out.println("Dealer hand after dealing (Viewd by player): " + dealer.showDealerUpCard());
		System.out.println("Dealer hand with down card shown: " + dealer.returnDealerHand());

		System.out.println();

		for(Card card : deck.getCards()){
			System.out.println(card);
			numOfCards2++;
		}
		System.out.println("Number of cards remaining after dealing: " + numOfCards2);
		

		



		

	}
}
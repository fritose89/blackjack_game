public class Main{
	public static void main(String [] args){
		Deck deck = new Deck(2);
		Player player = new Player();
		Dealer dealer = new Dealer();
		int numOfCards = 0;
		int numOfCards2 = 0;

		//deck.shuffle();

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
		player.recieveCardPlayer(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		
		player.recieveCardPlayer(deck.deal());
		dealer.recieveCardDealer(deck.deal());

		System.out.println("Player hand after dealing(User view): " + player.returnPlayerHandUser());
		System.out.println("Player hand after dealing(Array view): " + player.returnPlayerHandArray());
		System.out.println("Dealer hand after dealing(User view UpCard Method): " + dealer.showDealerUpCard());
		System.out.println("Dealer hand after dealing(User view full dealer hand): " + dealer.returnDealerHandUser());
		System.out.println("Dealer hand after dealing(Array view): " + dealer.returnDealerHandArray());

		System.out.println();

		for(Card card : deck.getCards()){
			System.out.println(card);
			numOfCards2++;
		}
		System.out.println("Number of cards remaining after dealing: " + numOfCards2);

		int indexOfCut = 0;
		for(Card card : deck.getCards()){
				if(card.getSuit() == Suit.CUT){
					System.out.println(indexOfCut);
				}
				indexOfCut++;
		}
		

		



		

	}
}
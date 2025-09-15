public class Main{
	public static void main(String [] args){
		Deck deck = new Deck(1);
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

		dealer.recieveCardDealer(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		//player.recieveCardPlayer(deck.deal());
		//dealer.recieveCardDealer(deck.deal());
		
		//player.recieveCardPlayer(deck.deal());
		System.out.println("Dealer has BJ: " + dealer.dHasBJ());
		

		



		

	}
}
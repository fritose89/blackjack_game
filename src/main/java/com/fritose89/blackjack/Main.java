public class Main{
	public static void main(String [] args){
		Deck deck = new Deck(1);
		Player player = new Player();
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

		
		player.recieveCard(deck.copyCard());
		deck.removeTopCard();
		player.recieveCard(deck.copyCard());
		deck.removeTopCard();

		System.out.println("Player hand after dealing: " + player.returnHand());

		System.out.println();

		for(Card card : deck.getCards()){
			System.out.println(card);
			numOfCards2++;
		}
		System.out.println("Number of cards remaining after dealing: " + numOfCards2);
		

		



		

	}
}
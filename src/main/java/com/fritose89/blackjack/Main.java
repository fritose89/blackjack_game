public class Main{
	public static void main(String [] args){
		Deck deck = new Deck(1);
		Deck twoDecks = new Deck(2);
		Deck eightDecks = new Deck(8);
			
		int numOfCards1 = 0;
		int numOfCards2 = 0;
		int numOfCards3 = 0;
		int numOfCards4 = 0;
		

		for(Card card : deck.getCards()){
			System.out.println(card);
			numOfCards1++;
		}
		System.out.println("Total decks in 1st deck: " + numOfCards1);

		
		
		System.out.println();

		for(Card card : twoDecks.getCards()){
			System.out.println(card);
			numOfCards2++;
		}
		System.out.println("Total decks in 2nd deck: " + numOfCards2);


		System.out.println();

		eightDecks.shuffle();

		for(Card card : eightDecks.getCards()){
			System.out.println(card);
			numOfCards3++;
		}
		System.out.println("Total decks in 3rd deck: " + numOfCards3);

		//eightDecks.burnTopCard();
		for(Card card : eightDecks.getCards()){
			System.out.println(card);
			numOfCards4++;
		}
		System.out.println("Total decks in 3rd deck after burning top card: " + numOfCards4);
		System.out.println(numOfCards3 + " Vs. " + numOfCards4);

	}
}
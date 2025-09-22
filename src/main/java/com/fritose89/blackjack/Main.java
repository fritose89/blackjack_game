public class Main{
	public static void main(String [] args){
	



		Deck deck = new Deck(2);

		Player player = new Player();
		Dealer dealer = new Dealer();


		player.recieveCardPlayer(deck.deal());
		player.recieveCardPlayer(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		dealer.recieveCardDealer(deck.deal());

		System.out.println(Game.handCompareOutput());

	}
}
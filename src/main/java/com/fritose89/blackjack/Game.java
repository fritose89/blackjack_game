import java.util.Scanner;
import java.util.ArrayList;

public class Game{

	static int dealerHandValue;
	static int playerHandValue;
	static Deck deck;
	static Player player;
	static Dealer dealer;

	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Blackjack!");
		System.out.println("Select the number of decks you wish to play with!");

		int input = scanner.nextInt();

		//Creating deck object
		deck = new Deck(input);

		//Creating dealer object, initalizing dealer arraylist to store hands
		dealer = new Dealer();

		//Creating player object, intitalizing player arraylist to store hands
		player = new Player();

		//Shuffling deck object
		deck.shuffle();

		player.recieveCard(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		player.recieveCard(deck.deal());
		dealer.recieveCardDealer(deck.deal());


		System.out.println("Player Hand: " + player.returnPlayerHand());
		System.out.println("Dealer Hand: " + dealer.showDealerUpCard());

		System.out.println();

		System.out.println("Player can either Hit or Stand!");



	

		




		


	}
	
	
	
}
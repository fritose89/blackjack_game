import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;

public class Game{

	
	static Deck deck;
	static Player player;
	static Dealer dealer;

	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Blackjack!");
		System.out.println("Select the number of decks you wish to play with!");

		int input = scanner.nextInt();
		scanner.nextLine();

		//Creating deck object
		deck = new Deck(input);

		//Creating dealer object, initalizing dealer arraylist to store hands
		dealer = new Dealer();

		//Creating player object, intitalizing player arraylist to store hands
		player = new Player();

		for(Card card : deck.getCards()){
			System.out.println(card);
			
		}
		System.out.println();

		

		for(Card card : deck.getCards()){
			System.out.println(card);
			
		}

		player.recieveCardPlayer(deck.deal());
		dealer.recieveCardDealer(deck.deal());
		player.recieveCardPlayer(deck.deal());
		dealer.recieveCardDealer(deck.deal());


		System.out.println("Player Hand: " + player.returnPlayerHandUser());
		System.out.println("Dealer Hand: " + dealer.showDealerUpCard());

		

		System.out.println("Player can either Hit or Stand!");
		String response = scanner.nextLine();

		
		if(response.equals("Hit")){
			player.recieveCardPlayer(deck.deal());
		}
		
		else{
			System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
			System.out.println("Player Hand: " + player.returnPlayerHandUser());
		}
		
		System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
		System.out.println("Player Hand: " + player.returnPlayerHandUser());
		System.out.println("Player Hand Value: " + player.playerHandValue());
		System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());

		



	

		




		


	}
	
	
	
}
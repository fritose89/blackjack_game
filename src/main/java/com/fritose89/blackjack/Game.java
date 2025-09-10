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

	
		System.out.println();

		

			player.recieveCardPlayer(deck.deal());
			player.recieveCardPlayer(deck.deal());
			dealer.recieveCardDealer(deck.deal());
			dealer.recieveCardDealer(deck.deal());

			if(player.playerHandValue() == 21 && dealer.dealerHandValue() < 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Player has Blackjack, Dealer Loses.");

			}

			else if(player.playerHandValue() == 21 && dealer.dealerHandValue() == 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Both Player and Dealer have Blackjack this is a Push!");
			}
				
			
			else if(player.playerHandValue() < 21 && dealer.dealerHandValue() == 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer has Blackjack, Player Loses.");
			}



			while(true){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.showDealerUpCard());
				if(player.playerHandValue() > 21){
					
					break;
				}
				else{
					System.out.println("Player may Hit or Stand");
					System.out.println();
					String response = scanner.nextLine();
					if(response.equals("Hit")){
						player.recieveCardPlayer(deck.deal());
					}
					else{
						break;
					}
				}
			}

			System.out.println("Player Hand: " + player.returnPlayerHandUser());
			System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
			System.out.println();
			

			while(true){
				if(dealer.dealerHandValue() >= 17){
					break;
				}
				else{
					System.out.println("Dealer Hits.");
					dealer.recieveCardDealer(deck.deal());
					System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
					System.out.println();
				}

			}

			int pHandValue = player.playerHandValue();
			int dHandValue = dealer.dealerHandValue();

			
			if((dHandValue > 21) && (pHandValue > 21)){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer and Player have busted out.");
			}

			else if(pHandValue > 21){
				System.out.println("Player has busted out, Dealer Wins!");
			}

			else if((dHandValue > 21) && (pHandValue <= 21)){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer Busts Out, Player Wins!");
			}
			
			else if((dHandValue <= 21) && (pHandValue <= 21)){
				if(dHandValue > pHandValue){
					System.out.println("Player Hand: " + player.returnPlayerHandUser());
					System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
					System.out.println("Dealer Wins!");
				}
				else{
					System.out.println("Player Hand: " + player.returnPlayerHandUser());
					System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
					System.out.println("Player Wins!");
				}
			}




		

		
	
		



	

		




		


	}

	
	
	
}
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
		

		

		
		
			
		while(true){	
		
			player.recieveCardPlayer(deck.deal());
			player.recieveCardPlayer(deck.deal());
			dealer.recieveCardDealer(deck.deal());
			dealer.recieveCardDealer(deck.deal());
			
		/*	
			if(player.playerHandValue() == 21 && dealer.dealerHandValue() < 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Player has Blackjack, Dealer Loses.");
				continue;

			}

			else if(player.playerHandValue() == 21 && dealer.dealerHandValue() == 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Both Player and Dealer have Blackjack this is a Push!");
				continue;
			}
				
			
			else if(player.playerHandValue() < 21 && dealer.dealerHandValue() == 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer has Blackjack, Player Loses.");
				continue;
			}

		*/

			while(true){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.showDealerUpCard());
				if(player.playerHandValue() >= 21){
					
					break;
				}
				else{
					System.out.println("Player may Hit or Stand");
					System.out.println();
					String response = scanner.nextLine();
					if(response.equals("Hit")){
						player.recieveCardPlayer(deck.deal());
						if(player.playerHandValue() >= 21);
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
				if(player.playerHandValue() == 21){
					break;
				}
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

			if(player.pHasBJ() == true && dHandValue < 21){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Player has Blackjack, Dealer Loses.");

			}

			else if(player.pHasBJ() == true && dealer.dHasBJ() == true){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Both Player and Dealer have Blackjack this is a Push!");

			}

			else if(pHandValue < 21 && dealer.dHasBJ() == true){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer has Blackjack, Player Loses.");
			}

			else if((dHandValue > 21) && (pHandValue > 21)){
				System.out.println("Player Hand Value: " + player.playerHandValue());
				System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer and Player have busted out.");
			}

			else if(pHandValue > 21){
				System.out.println("Player Hand Value: " + player.playerHandValue());
				System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Player has busted out, Dealer Wins!");
			}

			else if((dHandValue > 21) && (pHandValue <= 21)){
				System.out.println("Player Hand Value: " + player.playerHandValue());
				System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Dealer Busts Out, Player Wins!");
			}

			else if(dHandValue == pHandValue){
				System.out.println("Player Hand Value: " + player.playerHandValue());
				System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
				System.out.println("Player and Dealer Hand are Equal, Push!");
			}
			
			else if((dHandValue <= 21) && (pHandValue <= 21)){
				if(dHandValue > pHandValue){
					System.out.println("Player Hand Value: " + player.playerHandValue());
					System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
					System.out.println("Player Hand: " + player.returnPlayerHandUser());
					System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
					System.out.println("Dealer Wins!");
				}
				else{
					System.out.println("Player Hand Value: " + player.playerHandValue());
					System.out.println("Dealer Hand Value: " + dealer.dealerHandValue());
					System.out.println("Player Hand: " + player.returnPlayerHandUser());
					System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
					System.out.println("Player Wins!");
				}
			}


			System.out.println("Play again?: Yes or No");
			String response = scanner.nextLine();
			if(response.equals("No")){
				break;
			}
			else{
				player.resetPlayerHand();
				dealer.resetDealerHand();
				continue;
			}

		
		}
		


	}

	
	
	
}
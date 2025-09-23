import java.util.Scanner;
import java.util.ArrayList;
import java.security.SecureRandom;

class MyException extends Exception{
	public MyException(String m){
		super(m);
	}
}

public class Game{

	
	static Deck deck;
	static Player player;
	static Dealer dealer;
	static ArrayList holdsCut;


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
			
				//System.out.println("Player Hand: " + player.returnPlayerHandUser());
				  System.out.println("Dealer Hand: " + dealer.showDealerUpCard());

		

			while(true){
				System.out.println("Player Hand: " + player.returnPlayerHandUser());
				//System.out.println("Dealer Hand: " + dealer.showDealerUpCard());
				System.out.println();
				if(player.playerHandValue() >= 21){
					
					break;
				}
				else{
					
						
						System.out.println("Player may Hit or Stand");
						String response = scanner.nextLine();
						
						try{
							if(!response.equals("Hit") && !response.equals("Stand")){
								throw new MyException("Please enter either Hit or Stand");
							
							}
							
						}
						catch(MyException e){
							System.out.println(e.getMessage());
							System.out.println();
						}
						if(response.equals("Hit")){
							player.recieveCardPlayer(deck.deal());
							System.out.println();
						}
						else if(response.equals("Stand")){
							System.out.println();
							break;
						}

				}
					
			}

			System.out.println("Player Hand: " + player.returnPlayerHandUser());
			System.out.println("Dealer Hand: " + dealer.returnDealerHandUser());
			System.out.println();
			
			int sizeOfPlayerHand = player.size();
			while(true){
				if(player.playerHandValue() == 21 && dealer.dealerHandValue() <= 21 && sizeOfPlayerHand == 2){
					break;
				}
				else if(dealer.dealerHandValue() >= 17){
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
			int sizeOfDealerHand = dealer.size();
			/*

			if(pHandValue == 21 && dHandValue < 21 && sizeOfPlayerHand == 2){
				System.out.println(Game.handCompareOutput());
				System.out.println("Player has Blackjack, Dealer Loses.");

			}
			*/
			System.out.println(Game.handCompareOutput());

			if((pHandValue == 21 || dHandValue == 21) && (sizeOfPlayerHand == 2 || sizeOfDealerHand == 2)){
				if((pHandValue == 21 && dHandValue == 21) && (sizeOfPlayerHand == 2 && sizeOfDealerHand == 2)){
					System.out.println("Both Player and Dealer have Blackjack this is a Push!");
				}
				else if(pHandValue == 21 && dHandValue < 21 && sizeOfPlayerHand == 2){
					System.out.println("Player has Blackjack, Dealer Loses.");
				}
				else if(pHandValue != 21 && dHandValue == 21 && sizeOfDealerHand == 2){
					System.out.println("Dealer has Blackjack, Player Loses.");
				}

			}
			else{
				if(dHandValue > 21 || pHandValue > 21){
					if(dHandValue > 21 && pHandValue > 21){
						System.out.println("Dealer and Player have busted out.");
					}
					else if(pHandValue > 21 && dHandValue < 21){
						System.out.println("Player has busted out, Dealer Wins!");
					}
					else if(dHandValue > 21 && pHandValue < 21){
						System.out.println("Dealer Busts Out, Player Wins!");
					}
				}
				else{
					if(dHandValue == pHandValue){
						System.out.println("Player and Dealer Hand are Equal, Push!");
					}
					else{
						if(dHandValue > pHandValue){
							System.out.println("Dealer Wins!");
						}
						else{
							System.out.println("Player Wins!");
						}
					}
				}

			}


			/*
			else if(pHandValue == 21 && dHandValue == 21 && sizeOfPlayerHand == 2 && sizeOfDealerHand == 2){
				System.out.println(Game.handCompareOutput());
				System.out.println("Both Player and Dealer have Blackjack this is a Push!");

			}
			*/
			/*
			else if(pHandValue != 21 && dHandValue == 21 && sizeOfDealerHand == 2){
				System.out.println(Game.handCompareOutput());
				System.out.println("Dealer has Blackjack, Player Loses.");
			}
			*/
			/*
			else if((dHandValue > 21) && (pHandValue > 21)){
				System.out.println(Game.handCompareOutput());
				System.out.println("Dealer and Player have busted out.");
			}
			*/
			/*
			else if(pHandValue > 21){
				System.out.println(Game.handCompareOutput());
				System.out.println("Player has busted out, Dealer Wins!");
			}

			else if((dHandValue > 21) && (pHandValue <= 21)){
				System.out.println(Game.handCompareOutput());
				System.out.println("Dealer Busts Out, Player Wins!");
			}
			*/
			/*
			else if(dHandValue == pHandValue){
				System.out.println(Game.handCompareOutput());
				System.out.println("Player and Dealer Hand are Equal, Push!");
			}
			
			else if((dHandValue <= 21) && (pHandValue <= 21)){
				if(dHandValue > pHandValue){
					System.out.println(Game.handCompareOutput());
					System.out.println("Dealer Wins!");
				}
				else{
					System.out.println(Game.handCompareOutput());
					System.out.println("Player Wins!");
				}
			}
			*/

			System.out.println();
			System.out.println("Play again?: Yes or No");
			String response = scanner.nextLine();
			if(response.equals("No")){
				break;
			}
			else{
				
				System.out.println();
				player.resetPlayerHand();
				dealer.resetDealerHand();
				continue;
			}
		}
	}


	public static String handCompareOutput(){
		int pHandValue = player.playerHandValue();
		int dHandValue = dealer.dealerHandValue();
		String pHand = player.returnPlayerHandUser();
		String dHand = dealer.returnDealerHandUser();
		StringBuilder sb = new StringBuilder();
		sb.append("Player Hand Value: " + pHandValue + "\n");
		sb.append("Dealer Hand Value: " + dHandValue + "\n");
		sb.append("Player Hand: " + pHand + "\n");
		sb.append("Dealer Hand: " + dHand);
		String output = sb.toString();
		return output;

	}
	
}
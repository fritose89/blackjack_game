import java.util.Scanner;
import java.util.ArrayList;

public class Game{

	static int dealerHandValue;
	static int playerHandValue;
	static Deck deck;
	static Player player;

	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Blackjack!");
		System.out.println("Select the number of decks you wish to play with!");

		int input = scanner.nextInt();

		//Creating deck object
		deck = new Deck(input);

		//Creating player object, intitalizing player arraylist to store hands
		player = new Player();

		//Shuffling deck object
		deck.shuffle();

		




		


	}
	
	
	
}
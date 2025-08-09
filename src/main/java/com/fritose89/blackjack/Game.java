import java.util.Scanner;

import java.util.ArrayList;

public class Game{

	public static void main(String[] args){

		
			Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to Blackjack!");
			System.out.println("Select the number of decks you wish to play with!");

			int input = scanner.nextInt();

			//Creating deck object
			Deck deck = new Deck(input);

			//Shuffling deck object
			deck.shuffle();

			//Burning top card
			deck.remove(0);








	}





}
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Game{

	public static void main(String[] args){

			SecureRandom random = new SecureRandom();
			int minCut = 209;
			int maxCut = 333;
			int range = maxCut - minCut + 1;
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to Blackjack!");
			System.out.println("Select the number of decks you wish to play with!");

			int input = scanner.nextInt();

			//Creating deck object
			Deck deck = new Deck(input);

			//Shuffling deck object
			deck.shuffle();

			








	}





}
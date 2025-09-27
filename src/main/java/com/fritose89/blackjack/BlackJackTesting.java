//package com.fritose89.blackjack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class BlackJackTesting{
	private Player player;
	private Dealer dealer;
	private Deck deck;
	private Card card;


	@BeforeEach
	public void setup(){
		player = new Player();
		dealer = new Dealer();
	}

	@Test 
	public void testPlayerAceAdjustment(){
		player.recieveCardPlayer(new Card(Rank.ACE, Suit.HEARTS));
		player.recieveCardPlayer(new Card(Rank.KING, Suit.SPADES));
		assertEquals(21, player.playerHandValue());
		player.recieveCardPlayer(new Card(Rank.ACE, Suit.CLUBS));
		assertEquals(12, player.playerHandValue());
	}

	@Test  
	public void testDealerAceAdjustment(){
		dealer.recieveCardDealer(new Card(Rank.ACE, Suit.HEARTS));
		dealer.recieveCardDealer(new Card(Rank.KING, Suit.SPADES));
		assertEquals(21, dealer.dealerHandValue());
		dealer.recieveCardDealer(new Card(Rank.ACE, Suit.CLUBS));
		assertEquals(12, dealer.dealerHandValue());
	}

	@Test 
	public void testPlayerBlackJackDetect(){
		player.recieveCardPlayer(new Card(Rank.ACE, Suit.HEARTS));
		player.recieveCardPlayer(new Card(Rank.KING, Suit.SPADES));
		assertTrue(player.pHasBlackJack());

	}

	@Test 
	public void testDealerBlackJackDectect(){
		dealer.recieveCardDealer(new Card(Rank.ACE, Suit.HEARTS));
		dealer.recieveCardDealer(new Card(Rank.KING, Suit.SPADES));
		assertTrue(dealer.dHasBlackJack());

	}

	@Test 
	public void testPlayerBustedDetect(){
		player.recieveCardPlayer(new Card(Rank.TEN, Suit.HEARTS));
		player.recieveCardPlayer(new Card(Rank.KING, Suit.SPADES));
		player.recieveCardPlayer(new Card(Rank.FOUR, Suit.HEARTS));
		assertTrue(player.pHasBusted());

	}

	@Test 
	public void testDealerBustedDetect(){
		dealer.recieveCardDealer(new Card(Rank.TEN, Suit.HEARTS));
		dealer.recieveCardDealer(new Card(Rank.KING, Suit.SPADES));
		dealer.recieveCardDealer(new Card(Rank.FOUR, Suit.HEARTS));
		assertTrue(dealer.dHasBusted());

	}

	@Test
    void testDeckDealsCards() {
        Deck deck = new Deck(1);
        int initialSize = deck.getCards().size();
        Card dealt = deck.deal();
        assertNotNull(dealt);
        assertEquals(initialSize - 1, deck.getCards().size());
    }

    @Test
    void testReshuffleFlag() {
        Deck deck = new Deck(1);
        // force a cut card
        deck.deal(); 
        while (!deck.isReshuffleNeeded() && !deck.getCards().isEmpty()) {
            deck.deal();
        }
        assertTrue(deck.isReshuffleNeeded());
    }

    @Test
    void testReshuffleResetsDeck() {
        Deck deck = new Deck(1);
        deck.rebuildDeck();
        assertFalse(deck.isReshuffleNeeded());
        assertTrue(deck.getCards().size() > 0);
    }
}

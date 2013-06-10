package search;

import java.util.Comparator;

import game.PlayingCard;
import game.PlayingCardDeck;

public class Main {

	public static void main(String[] args) {
		
		PlayingCard c1 = new PlayingCard(1, "a");
		PlayingCard c2 = new PlayingCard(2, "a");
		PlayingCard c3 = new PlayingCard(3, "a");
		PlayingCard c4 = new PlayingCard(4, "a");
		PlayingCard[] cards = {c1, c2, c3, c4};
		
		Comparator<PlayingCard> cmp = new Comparator<PlayingCard>() {
			@Override
			public int compare(PlayingCard o1, PlayingCard o2) {
				return (int) Math.signum(o1.getValue() - o2.getValue());
			}
		};
		
		PlayingCard searchResultCard = cards[Search.binarySearch(cards, new PlayingCard(4, "a"), cmp)];
		System.out.println(searchResultCard);
		
		PlayingCard searchResultCardLinear = cards[Search.linearSearch(cards, new PlayingCard(4, "a"))];
		System.out.println(searchResultCardLinear);
	}

}

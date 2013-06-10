package search;

import game.PlayingCard;

import java.util.Comparator;

public class Search {	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int binarySearch(Object[] array, Object key, Comparator cmp) {  
		int anfang = 0;
		int ende = array.length - 1;
		int mitte = (anfang + ende) / 2;

		while (anfang <= ende && cmp.compare(key, array[mitte]) != 0) {
			if (cmp.compare(key, array[mitte]) < 0)
				ende = mitte - 1;
			else
				anfang = mitte + 1;

			mitte = (anfang + ende) / 2;
		}

		if (anfang <= ende)
			return mitte;
		else
			return -1;
	}
	
	public static int linearSearch(PlayingCard[] cards, PlayingCard key) {
		int i = 0;

		while(i != cards.length && !key.equals(cards[i])) {
			i++;
		}

		return (i < cards.length) ? i : -1;
	}
}



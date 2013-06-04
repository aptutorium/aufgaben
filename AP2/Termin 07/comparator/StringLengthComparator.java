package compare;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (int) Math.signum(s1.length() - s2.length());
	}

}

package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int NUMBERS = 12;
	public static final int NEGATIVE = -1;
	public static final int FULL = 11;
	private int[] numbers = new int[NUMBERS];

	public int total = NEGATIVE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == NEGATIVE;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaBoo() {
		if (callCheck())
			return NEGATIVE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return NEGATIVE;
		return numbers[total--];
	}

}

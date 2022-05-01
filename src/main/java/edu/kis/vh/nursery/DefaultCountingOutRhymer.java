package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS = 12;
	private static final int NEGATIVE = -1;
	private static final int FULL = 11;
	private final int[] numbers = new int[NUMBERS];

	private int total = NEGATIVE;

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

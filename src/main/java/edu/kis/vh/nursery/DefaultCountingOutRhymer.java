package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int NUMBERS = 12;
	private static final int NEGATIVE = -1;
	private static final int FULL = 11;
	private final int[] numbers = new int[NUMBERS];

	private int total = NEGATIVE;

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}

	public boolean callCheck() {
		return total == NEGATIVE;
	}

	public int getTotal() {
		return total;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaBoo() {
		if (callCheck())
			return NEGATIVE;
		return getNumbers()[total];
	}

	public int countOut() {
		if (callCheck())
			return NEGATIVE;
		return getNumbers()[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}
}

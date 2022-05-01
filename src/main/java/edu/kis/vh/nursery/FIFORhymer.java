package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {


	private DefaultCountingOutRhymer countingRhymer = new DefaultCountingOutRhymer();

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	
	@Override
	public int countOut() {
		while (!callCheck())
			
		getCountingRhymer().countIn(super.countOut());
		
		int ret = getCountingRhymer().countOut();
		
		while (!getCountingRhymer().callCheck())
			
		countIn(getCountingRhymer().countOut());
		
		return ret;
	}

	public DefaultCountingOutRhymer getCountingRhymer() {
		return countingRhymer;
	}

	public void setCountingRhymer(DefaultCountingOutRhymer countingRhymer) {
		this.countingRhymer = countingRhymer;
	}

	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

	public void setTemp(DefaultCountingOutRhymer temp) {
		this.temp = temp;
	}
}

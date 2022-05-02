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



	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}


}

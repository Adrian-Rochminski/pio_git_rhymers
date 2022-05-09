package edu.kis.vh.nursery;

// TODO: 09.05.2022 usunac niepotrzebne funkcje 

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

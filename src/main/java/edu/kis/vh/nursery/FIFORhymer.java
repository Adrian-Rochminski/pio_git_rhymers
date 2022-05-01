package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {


	private DefaultCountingOutRhymer countingRhymer = new DefaultCountingOutRhymer();

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	
	@Override
	public int countOut() {
		while (!callCheck())
			
		countingRhymer.countIn(super.countOut());
		
		int ret = countingRhymer.countOut();
		
		while (!countingRhymer.callCheck())
			
		countIn(countingRhymer.countOut());
		
		return ret;
	}
}

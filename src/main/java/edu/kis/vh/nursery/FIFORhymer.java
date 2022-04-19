package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer countingRhymer = new defaultCountingOutRhymer();
	
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

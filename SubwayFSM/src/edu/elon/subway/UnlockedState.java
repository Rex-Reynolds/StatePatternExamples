package edu.elon.subway;

public class UnlockedState implements State {
	Subway subway;
	
	public UnlockedState(Subway subway){
		this.subway = subway;
	}

	@Override
	public void passThrough() {
		System.out.println("you passed through");
		subway.setState(subway.getLockedState());
		
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted another quarter!");

		
	}


}

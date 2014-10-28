package edu.elon.subway;

public class LockedState implements State {
	Subway subway;
	
	public LockedState(Subway subway){
		this.subway = subway;
	}

	@Override
	public void passThrough() {
		System.out.println("Sound the alarm!");
		
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		subway.setState(subway.getUnlockedState());
		
	}

}

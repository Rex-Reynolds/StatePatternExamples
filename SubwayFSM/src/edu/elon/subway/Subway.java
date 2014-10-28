package edu.elon.subway;

public class Subway {
	State lockedState;
	State unlockedState;
	State state;


	public Subway() {
		this.setState(lockedState);
		
	lockedState = new LockedState(this);
	unlockedState = new UnlockedState(this);
		

	}
	
	public void instertQuarter(){
		state.insertQuarter();
	}

	public void passThrough(){
		state.passThrough();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return state;
	}
	
	public State getLockedState(){
		return lockedState;
	}
	
	public State getUnlockedState(){
		return unlockedState;
	}
	
}

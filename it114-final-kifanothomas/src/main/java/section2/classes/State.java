package section2.classes;

import section2.interfaces.HasCapital;
import section2.interfaces.HasGovernor;

public class State <C extends Capital, G extends Governor> implements HasCapital<C>, HasGovernor <G>{

	
	private String name;
	private C Capital;
	private G Governor;
	State<C,G> getState;
	
	public State(String string, Capital capital2, Governor governor2) {
		// TODO Auto-generated constructor stub
	}
	public G getGovernor() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}
	public C getCapital() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCapitalname() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getStateName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}

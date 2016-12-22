package section2.classes;

import section2.interfaces.HasCapital;
import section2.interfaces.HasName;

public class Country <C, G> implements HasCapital, HasName {

	private String name;
	private C Capital; 
	public Country(String _name, C _capital){
		 _name = name;
		 _capital = Capital;
		 
	}
	
	public void getname() {
		// TODO Auto-generated method stub
		
	}
	public section2.classes.Capital getCapital() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCapitalname() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

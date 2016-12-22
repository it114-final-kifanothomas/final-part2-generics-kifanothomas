package section2.interfaces;

import section2.classes.Capital;

public interface HasCapital<C extends Capital>{
	
	
	public C getCapital();
	public String getCapitalname();
	

}

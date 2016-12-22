package section2.interfaces;

import section2.classes.Governor;

public interface HasGovernor <G extends Governor> {

	public G getGovernor();
	public String getGovernorName();
}

package section2.classes;

public class StateTaster {

	public static void main(String[] args) {
		
		State<Capital, Governor> nj = new State<Capital, Governor>("NJ", new Capital("Trenton"), new Governor ("Christie"));
		System.out.println("NJ name:"+ nj.getStateName() + ", capital name" + nj.getCapitalname() + ",governor" + nj.getGovernorName());
		
		 
		
		// TODO Auto-generated method stub

	}

}

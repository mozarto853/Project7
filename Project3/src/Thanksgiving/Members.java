package Thanksgiving;

public class Members {

	public static void main(String[] args) {
		
		Invitation f1 = new Invitation();
		f1.settFamily("Ortiz");
		f1.settMembers(5);
		f1.settPlate("Mac & Cheese");
		
		System.out.println(f1.gettFamily() + " " + f1.gettMembers() + " " + f1.gettPlate());
		
		Invitation f2 = new Invitation("Rahman",4,"Pasta");
		System.out.println(f2.gettFamily() + " " + f2.gettMembers() + " " + f2.gettPlate());
		

	}

}

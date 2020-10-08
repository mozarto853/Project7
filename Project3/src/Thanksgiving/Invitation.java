package Thanksgiving;

public class Invitation {
	
	private String tFamily;
	private int tMembers;
	private String tPlate;
	public Invitation () {}
	
	public Invitation(String tFamily, int tMembers, String tPlate) {
		super();
		this.tFamily = tFamily;
		this.tMembers = tMembers;
		this.tPlate = tPlate;
	}
	
	
	public String gettFamily() {
		return tFamily;
	}
	public void settFamily(String tFamily) {
		this.tFamily = tFamily;
	}
	public int gettMembers() {
		return tMembers;
	}
	public void settMembers(int tMembers) {
		this.tMembers = tMembers;
	}
	public String gettPlate() {
		return tPlate;
	}
	public void settPlate(String tPlate) {
		this.tPlate = tPlate;
	}
	
	}
	
	



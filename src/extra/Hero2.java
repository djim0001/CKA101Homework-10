package extra;

public class Hero2 {

	private String name;
	private int level;
	private double exp;
	private Attackable atk;
	
	public Hero2() {
		
	}
	
	public Hero2(String name, int level, double exp, Attackable atk) {
		this.name = name;
		this.level = level;
		this.exp = exp;
		this.atk = atk;
	}
	public void attack() {
		atk.attack();
	}
		
	public void move() {
		System.out.println("跑步");
	}
	
	public void defend() {
		System.out.println("做防禦動作");
	}
	
}

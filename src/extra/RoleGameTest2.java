package extra;

public class RoleGameTest2 {
	public static void main(String[] args) {
		Hero2 saber = new Hero2("亞拉岡", 1, 0, new SwordMan2());
		Hero2 archer = new Hero2("勒苟拉斯", 1, 0, new ArrowMan2());
		
		saber.attack();
		saber.move();
		
		archer.attack();
		archer.defend();
		
	}
	
}

package hw4;

public class ClassMateTest {
	
	public static void main(String[] args) {
//		請算出每位同學考最高分的次數
		ClassMateTest cmt = new ClassMateTest();
		int[][] test = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};	
		cmt.topTimes(1, test);
		cmt.topTimes(2, test);
		cmt.topTimes(3, test);
		cmt.topTimes(4, test);
		cmt.topTimes(5, test);
		cmt.topTimes(6, test);
		cmt.topTimes(7, test);
		cmt.topTimes(8, test);
		
	}
	public int topCheck(int classNo, int[] t) {
		int compare = 1;
		for(int a = 0; a < t.length; a++) {
			if(t[classNo - 1] == t[a]) {
				compare *= 1;
			}else if(t[classNo - 1] < t[a]) {
				compare *= 0;
			}else {
				compare *= 1;
			}
		}
		return compare;
		
	}
	public void topTimes(int classNo, int[][] tt) {
		int topTimes = 0;
		for(int i = 0; i < tt.length; i++) {
			topTimes += topCheck(classNo, tt[i]);
		}
		System.out.printf("%d號考最高分的次數是%d次", classNo, topTimes);
		System.out.println();
	}
	
}

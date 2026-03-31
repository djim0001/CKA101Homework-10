package hw3;

public class GuessNumb {
	public static void main(String[] args) {
		Hw3Tool htl = new Hw3Tool();
		int ans = (int)(Math.random() * 101);
//		System.out.println(ans);
		int sum = 0;
		while(true) {
			int i = htl.numbCheck(0, 100, "請輸入數字:");
			if(i < ans) {
				System.out.println("再大一點");
				sum++;
				continue;
			}else if(i > ans) {
				System.out.println("在小一點");
				sum++;
				continue;
			}else {
				System.out.println("答對了!!! 總共作答次數：" + sum + "次");
				break;
			}
		}	
	}

}

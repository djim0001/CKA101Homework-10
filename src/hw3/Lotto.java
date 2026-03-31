package hw3;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		Hw3Tool htl = new Hw3Tool();
				
		int ngNumb = htl.numbCheck(1, 9, "請輸入不喜歡的數字: ");
		int ngNumb10 = ngNumb * 10;

		System.out.println("可選的數字有：");
		int[] allNumb = new int[49];
		int pickSum = 1;
		for(int numb = 1; numb <= allNumb.length; numb++) {
			if((ngNumb - numb) % 10 == 0) {
				// 略過
			}else if ((ngNumb10 + 10) > numb && ngNumb10 <= numb){
				// 略過
			}else if (pickSum % 5 == 0) {
				allNumb[pickSum - 1] = numb;
				pickSum++;
				System.out.printf("%2d%n", numb);
			}else {
				allNumb[pickSum - 1] = numb;
				pickSum++;
				System.out.printf("%2d ", numb);
			}		
		}
		System.out.println("總共有：" + (pickSum - 1) + "個數可以選擇。");
		int[] pickNumb = Arrays.copyOf(allNumb, pickSum);
		int[] randomNumb = htl.numbRandomPick1Start(pickNumb.length, 6);
		System.out.print("隨機選號：");
		for(int i = 0; i < randomNumb.length; i++) {
			System.out.print(pickNumb[randomNumb[i] - 1] + " ");
		}
		
	}
	
	
}

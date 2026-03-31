package hw3;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		Hw3Tool htl = new Hw3Tool();
		
		int sum = 1;
		int ngNumb = htl.numbCheck(1, 9, "請輸入不喜歡的數字: ");
		int ngNumb10 = ngNumb * 10;
		System.out.println("ngNumb= " + ngNumb);
		int[] allNumb = new int[49];
		for(int numb = 1; numb <= allNumb.length; numb++) {
			if((ngNumb - numb) % 10 == 0) {
				
			}else if ((ngNumb10 + 10) > numb && ngNumb10 <= numb){
				
			}else if (sum % 5 == 0) {
				allNumb[sum - 1] = numb;
				sum++;
				System.out.printf("%2d%n", numb);
			}else {
				allNumb[sum - 1] = numb;
				sum++;
				System.out.printf("%2d ", numb);
			}		
		}
		System.out.println("總共有：" + (sum - 1) + "個數可以選擇。");
		int[] pickNumb = Arrays.copyOf(allNumb, sum);
		int[] randomNumb = htl.numbRandomPick1Start(pickNumb.length, 6);
		System.out.print("隨機選號：");
		for(int i = 0; i < 6; i++) {
			System.out.print(pickNumb[randomNumb[i] - 1] + " ");
		}
		
	}
	
	
}

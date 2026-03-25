package hw1;

public class Hw1 {
	public static void main(String[] args) {
		//題目1
		int i = 12,j = 6;
		int sum1 = i + j;
		int sum2 = i * j;
		System.out.println("12 + 6 = " + sum1);
		System.out.println("12 * 6 = " + sum2);
		System.out.println();
		
		//題目2
		int eggs = 200;
		System.out.printf("%d顆雞蛋共是%3d打又%2d顆。%n", eggs, eggs/12, eggs%12);
		System.out.println();
		
		//題目3
		int second = 256559;	
		int daySec = 60 * 60 * 12,
			hourSec = 60 * 60,
			minSec = 60;
		
		System.out.printf("256559秒為%d天%d小時%d分%d秒。%n", second / daySec,
				(second % daySec) / hourSec,
				(second % hourSec) / minSec,
				second % minSec);
		System.out.println();
		
		//題目4
		final double PI = 3.1415;
		int r = 5;
		double circumference = 2 * r * PI, 
			   circleArea = r * r * PI;
		System.out.printf("半徑為5的圓周長長度為:%.5f 園面積為:%.5f。%n", circumference, circleArea);
		System.out.println();
		
		//題目5
		//FV = PV *(1 + r)pow(n)
		int pv = 1500000, years = 10;
		double rate = 0.02,
		       fv = pv * Math.pow((1 + rate), years);
		System.out.printf("共有%f元%n",fv);
		System.out.println();
		
		//題目6
		System.out.println(5 + 5);
		//因為他是 int + int，所以會進行一般的數字運算，所以 5 + 5 = 10。
		System.out.println(5 + '5');
		//因為這裡是 int + char，char可以轉為 int，就是用 Unicode，而字元 5 的編碼為 53，所以 5 + 53 = 58
		System.out.println(5 + "5");
		//這裡是 int + String， + 號一樣變成串接，而字串 5 即是顯示 5，所以 5 串接 5 = 55。
		
	}
}

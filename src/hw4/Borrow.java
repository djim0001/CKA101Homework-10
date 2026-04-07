package hw4;

import hw3.Hw3Tool;

public class Borrow {
	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//      eno: 25/32/8/19/27
//		cash: 2500/800/500/1000/1200
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
	
		Hw3Tool htl3 = new Hw3Tool();
		int[][] borrowMember = {
				{25, 2500},
				{32, 800},
				{8, 500},
				{19, 1000},
				{27, 1200}
		};
		int borrowCash = htl3.numbCheck("請輸入想要借的金額：");
		int borrowMemberSum = 0;
		System.out.print("員工編號：");
		for(int i = 0; i < borrowMember.length; i++) {
			if(borrowCash <= borrowMember[i][1]) {
				System.out.print(borrowMember[i][0] + " ");
				borrowMemberSum++;
			}
		}
		System.out.println("總共 " + borrowMemberSum + " 人！");
		
	}
	
}

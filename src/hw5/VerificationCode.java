package hw5;

public class VerificationCode {

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static void main(String[] args) {
		VerificationCode vfc = new VerificationCode();
		String userCode = vfc.genAuthCode(8);
		
//		System.out.println("請輸入驗證碼：");
//		Scanner scr = new Scanner(System.in);
//		String cpuCode = scr.next();
//		if(userCode.equals(cpuCode)) {
//			System.out.println("驗證成功");
//		}else {
//			System.out.println("驗證失敗");
//		}
		
	}
	
	String genAuthCode(int countLength){
		String userCode = "";
		for(int i = 0; i < countLength; i++) {
			int rdWord = (int)(Math.random() * 3);
			if(rdWord == 1) {
				char lowerCase = (char)(Math.random() * 26 + 97);
				System.out.print(lowerCase);
				userCode += lowerCase;
			}else if(rdWord == 2) {
				char upperCase = (char)(Math.random() * 26 + 65);
				System.out.print(upperCase);
				userCode += upperCase;
			}else {
				int numb = (int)(Math.random() * 9 + 1);
				System.out.print(numb);
				userCode += numb;
			}
			
		}
		System.out.println();
		return userCode;
	}
	
}

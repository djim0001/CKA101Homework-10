package hw9;

public class Expense {

	public static void main(String[] args) {
//		熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//		錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//		3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//		以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//		大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//		已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//		1000元,寫一個Java程式模擬匯款10次與提款10次的情
//		形。
		Account account = new Account();
		Mom mom = new Mom(account);
		BearBig bb = new BearBig(account);
		mom.start();
		bb.start();
	}

}

class Account {
	private int money = 0;
	private static boolean times = true;
	
	public void timesOver() {
		times = false;
	}

	synchronized public void saving(int saveMoney) {
		if(times) {
			while (money > 3000) {
				System.out.println("生活費超過三千元，媽媽停止匯錢。");
				try {
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			money += saveMoney;
			System.out.println("媽媽匯款 " + saveMoney + "元，現在帳戶：" + money + "元");
			notify();
		}
	}

	synchronized public void takeOut(int takeMoney) {
		if(times) {
			while (money < takeMoney) {
				System.out.println("餘額不足，熊大暫停提款。");
				try {
					if (money < 2000) {
						System.out.println("熊大要求媽媽匯款。");
						notify();
					}
					wait();
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			money -= takeMoney;
			System.out.println("熊大提款 " + takeMoney + "元，現在帳戶：" + money + "元");
			notify();
		}
	}

}

class Mom extends Thread {
	Account account;

	public Mom(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.saving(2000);
		}
		account.timesOver();
	}
}

class BearBig extends Thread {
	Account account;

	public BearBig(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.takeOut(1000);
		}
		account.timesOver();
	}
}

package hw9;

public class Eater implements Runnable{
//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.java
//	• 需留意主執行緒執行順序

	private String name;
	int rice = 1;
	static boolean game = true;
	Eater(){}
	Eater(String name){
		this.setName(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(game) {
			if(rice < 10) {
				System.out.println(name + "吃第" + rice + "碗飯");
				rice++;
				try {
					Thread.sleep((int)(Math.random() * 25 + 5) * 100);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}else {
				System.out.println(name + "吃第" + rice + "碗飯");
				System.out.println(name + "勝利!");
				game = false;
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Eater eater1 = new Eater("詹姆士");
		Thread t1 = new Thread(eater1);
		Eater eater2 = new Eater("饅頭人");
		Thread t2 = new Thread(eater2);
		
		t1.start();
		t2.start();
		
	}
}

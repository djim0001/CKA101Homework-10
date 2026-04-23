package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8 {

	public static void main(String[] args) {
//		• 請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		List list = new ArrayList();
		Pen pen = new Pen("SKB", 100);
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add(new Short("100"));
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(pen);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator objs = list.iterator();
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
		System.out.println("==========================");
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("==========================");
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("==========================");
//		• 移除不是java.lang.Number相關的物件
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Number) {
			}else 
				list.remove(i);
		}
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		for(Object num : list)
			System.out.println(num);
	}
	
}
class Pen {
	private String brand;
	private double price;
	
	public Pen() {}
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public String toString() {
		return brand + " " + price;
	}
}

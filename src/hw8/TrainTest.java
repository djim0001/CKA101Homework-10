package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {
//		設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//		需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
		Train tr1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train tr2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train tr3 = new Train(118, "自強", "高雄", "台北", 500);
		Train tr4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train tr5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train tr6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train tr7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
//		• 請寫一隻程式,能印出不重複的Train物件
		Set<Train> set = new HashSet<Train>();
		set.add(tr1);
		set.add(tr2);
		set.add(tr3);
		set.add(tr4);
		set.add(tr5);
		set.add(tr6);
		set.add(tr7);
		for(Train atr : set)
			atr.display();
		System.out.println("====================================");
		
//		• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		List<Train> list = new ArrayList<Train>(); 
		list.add(tr1);
		list.add(tr2);
		list.add(tr3);
		list.add(tr4);
		list.add(tr5);
		list.add(tr6);
		list.add(tr7);
		list.sort(null);
		for(int i = 0; i < list.size(); i++) {
			(list.get(i)).display();
		}
			
		System.out.println("====================================");
		
;//		• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		Set<Train> set2 = new TreeSet<Train>();
		set2.add(tr1);
		set2.add(tr2);
		set2.add(tr3);
		set2.add(tr4);
		set2.add(tr5);
		set2.add(tr6);
		set2.add(tr7);
		Iterator objs = set2.iterator();
		while(objs.hasNext()) {
			((Train)objs.next()).display();
		}

//		• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		
		
	}
}

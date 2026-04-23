package hw8;

public class Train implements Comparable<Train>{

//	請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
	private int number;
	private String type, star, dest;
	private double price;
	
	public Train() {}
	public Train(int number, String type, String star, String dest, double price) {
		this.setter(number, type, star, dest, price);
	}
	public void setter(int number, String type, String star, String dest, double price) {
		this.number = number;
		this.type = type;
		this.star = star;
		this.dest = dest;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}
	public String getStar() {
		return star;
	}
	public String getDest() {
		return dest;
	}
	public double getPrice() {
		return price;
	}
	public void display() {
		System.out.printf("班次：%d 車種：%s 出發地：%s 目的地：%s 票價：%.0f元%n" 
				, number, type, star, dest, price);
	}
	
	@Override
	public int hashCode() {
		final int prim = 31;
		int result = 1;
		result = prim * result + number;
		return result;
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number;
	}
	@Override
	public int compareTo(Train o) {
		// TODO Auto-generated method stub
		if(this.number > o.number) {
			return -1;
		}else if(this.number == o.number){
			return 0;
		}else {
			return 1;
		}
	}
}

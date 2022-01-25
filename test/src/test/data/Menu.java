package test.data;

public class Menu {
	private String name;
	private String price;
	private String kind;
	public Menu(String name, String price, String kind) {
		this.name = name;
		this.price = price;
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void info() {
		System.out.println("메뉴:"+name+ " 종류:"+ kind+" 가격:"+price);
	}
	
}